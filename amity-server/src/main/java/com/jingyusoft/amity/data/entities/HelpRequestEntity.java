package com.jingyusoft.amity.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;
import org.joda.time.DateTime;

import com.jingyusoft.amity.data.DataConstants;

@Entity
@Table(name = "help_request")
public class HelpRequestEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_help_request_user"))
	private AmityUserEntity user;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "from_city", foreignKey = @ForeignKey(name = "fk_help_request_from_city"))
	@Audited(withModifiedFlag = true)
	private CityEntity fromCity;

	@Column(name = "from_latitude", nullable = true)
	@Audited(withModifiedFlag = true)
	private Double fromLatitude;

	@Column(name = "from_longitude", nullable = true)
	@Audited(withModifiedFlag = true)
	private Double fromLongitude;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "to_city", foreignKey = @ForeignKey(name = "fk_help_request_to_city"))
	@Audited(withModifiedFlag = true)
	private CityEntity toCity;

	@Column(name = "to_latitude", nullable = true)
	@Audited(withModifiedFlag = true)
	private Double toLatitude;

	@Column(name = "to_longitude", nullable = true)
	@Audited(withModifiedFlag = true)
	private Double toLongitude;

	@Column(name = "from_date_time")
	@Type(type = DataConstants.JODA_TIME_PERSISTENT_CLASS)
	private DateTime fromDateTime;

	@Column(name = "to_date_time")
	@Type(type = DataConstants.JODA_TIME_PERSISTENT_CLASS)
	private DateTime toDateTime;

	@Version
	@Column(name = "version_lock")
	private long versionLock;

	public AmityUserEntity getUser() {
		return user;
	}

	public CityEntity getFromCity() {
		return fromCity;
	}

	public DateTime getFromDateTime() {
		return fromDateTime;
	}

	public Double getFromLatitude() {
		return fromLatitude;
	}

	public Double getFromLongitude() {
		return fromLongitude;
	}

	public Long getId() {
		return id;
	}

	public CityEntity getToCity() {
		return toCity;
	}

	public DateTime getToDateTime() {
		return toDateTime;
	}

	public Double getToLatitude() {
		return toLatitude;
	}

	public Double getToLongitude() {
		return toLongitude;
	}

	public long getVersionLock() {
		return versionLock;
	}

	public void setUser(AmityUserEntity user) {
		this.user = user;
	}

	public void setFromCity(CityEntity fromCity) {
		this.fromCity = fromCity;
	}

	public void setFromDateTime(DateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public void setFromLatitude(Double fromLatitude) {
		this.fromLatitude = fromLatitude;
	}

	public void setFromLongitude(Double fromLongitude) {
		this.fromLongitude = fromLongitude;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setToCity(CityEntity toCity) {
		this.toCity = toCity;
	}

	public void setToDateTime(DateTime toDateTime) {
		this.toDateTime = toDateTime;
	}

	public void setToLatitude(Double toLatitude) {
		this.toLatitude = toLatitude;
	}

	public void setToLongitude(Double toLongitude) {
		this.toLongitude = toLongitude;
	}

	public void setVersionLock(long versionLock) {
		this.versionLock = versionLock;
	}
}
