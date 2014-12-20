package com.jingyusoft.amity.domain.geographics;

import com.jingyusoft.amity.data.entities.CityEntity;
import com.jingyusoft.amity.thrift.generated.CityDto;

public class City extends LocationBase {

	private Integer countryId;

	private Country country;

	/**
	 * The name of the city and its subdivision, in case of any duplicated city names in the same country.
	 */
	private final String displayName;

	private final GeoLocation geoLocation;

	public City(CityEntity entity) {
		super(LocationType.CITY, entity.getId(), entity.getCityName());

		displayName = entity.getDisplayName();
		geoLocation = GeoLocation.from(entity.getLatitude(), entity.getLongitude());

		if (entity.getCountry() != null) {
			countryId = entity.getCountry().getId();
		}
	}

	public Country getCountry() {
		return country;
	}

	public Integer getCountryId() {
		return countryId;
	}

	@Override
	public String getDisplayName() {
		return displayName;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public CityDto toDto() {
		CityDto cityDto = new CityDto();
		cityDto.setId(getId());
		cityDto.setName(getDisplayName());
		cityDto.setLatitude(geoLocation.getLatitude());
		cityDto.setLongitude(geoLocation.getLongitude());
		if (getCountry() != null) {
			cityDto.setCountryName(getCountry().getName());
		}
		return cityDto;
	}
}
