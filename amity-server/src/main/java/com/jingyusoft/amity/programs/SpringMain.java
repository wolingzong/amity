package com.jingyusoft.amity.programs;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jingyusoft.amity.common.AmityEnvironment;
import com.jingyusoft.amity.common.AmityEnvironment.WorkingEnvironment;
import com.jingyusoft.amity.common.AmityExceptionHandler;
import com.jingyusoft.amity.common.AmityLogger;
import com.jingyusoft.amity.common.AmityMailAlert;
import com.jingyusoft.amity.common.AmityPropertiesRepository;
import com.jingyusoft.amity.common.Mail;
import com.jingyusoft.amity.common.SecurityUtils;
import com.jingyusoft.amity.common.StringMessage;

public class SpringMain {

	public static ClassPathXmlApplicationContext getApplicationContext() {
		return applicationContext;
	}

	private static void loadJdbcPassword(AmityPropertiesRepository amityProperties) {

		final String vmArgumentPassword = System.getProperty("jdbc.password");
		final String passwordFileName = System.getProperty("jdbc.password.file");

		if (StringUtils.isNotBlank(vmArgumentPassword)) {
			LOGGER.info("Loading JDBC password from VM arguments [{}]", "jdbc.password");
			System.setProperty("jdbc.password", vmArgumentPassword);
		} else if (StringUtils.isNotBlank(passwordFileName)) {
			LOGGER.info("Loading JDBC password from password file [{}]", passwordFileName);
			System.setProperty("jdbc.password", SecurityUtils.getPasswordFromFile(passwordFileName));
		} else {
			LOGGER.info("Loading JDBC password from properties file");
			System.setProperty("jdbc.password", amityProperties.getProperty("jdbc.password"));
		}

		if (StringUtils.isBlank(System.getProperty("jdbc.password"))) {
			System.err.println("Failed to load Amity database password");
		}
	}

	public static void main(String[] args) {

		final String applicationContextFile = System.getProperty("application.context");
		if (StringUtils.isEmpty(applicationContextFile)) {
			System.err.println("Application context file not specified");
			return;
		}

		// Set the active Spring profile
		System.setProperty("spring.profiles.active", AmityEnvironment.getWorkingEnvironment().getConfigMode());

		AmityPropertiesRepository amityProperties = new AmityPropertiesRepository();
		amityProperties.initialize();

		// Initialize mail sender
		Mail.initializeWith(amityProperties);

		// Initialize exception handler
		AmityMailAlert.initializeWith(amityProperties);

		// Try loading JDBC password from different sources
		loadJdbcPassword(amityProperties);

		try {
			applicationContext = new ClassPathXmlApplicationContext(applicationContextFile);
			LOGGER.info("Spring main started successfullly. " + applicationContext.getBeanDefinitionCount()
					+ " beans created.");
		} catch (Exception e) {
			LOGGER.error("Failed to load Spring application context", e);
			AmityExceptionHandler.handle("Failed to initialize application context", e);
		}

		if (AmityEnvironment.getWorkingEnvironment() != WorkingEnvironment.DEV) {
			final String message = StringMessage.with("Amity server started successfully at {}", DateTime.now()
					.toString("yyyy-MM-dd HH:mm:ss"));
			AmityMailAlert.send(message, message);
		}
	}

	static {
		DateTimeZone.setDefault(DateTimeZone.UTC);
	}

	private static final Logger LOGGER = AmityLogger.getLogger();

	private static ClassPathXmlApplicationContext applicationContext = null;
}
