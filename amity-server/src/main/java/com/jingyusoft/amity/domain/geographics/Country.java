package com.jingyusoft.amity.domain.geographics;

import java.util.List;

import org.apache.commons.collections4.ListUtils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.jingyusoft.amity.data.entities.CountryEntity;
import com.jingyusoft.amity.thrift.generated.CountryDto;

public class Country extends LocationBase {

	private final List<City> cities = Lists.newArrayList();

	private final List<Region> regions = Lists.newArrayList();

	public Country(CountryEntity entity) {
		super(entity.getId(), entity.getCode(), entity.getName(), entity.getLatitude(), entity.getLongitude());
	}

	public Country addCity(final City city) {
		cities.add(city);
		return this;
	}

	public Country addRegion(final Region region) {
		regions.add(region);
		return this;
	}

	public List<City> getCities() {
		return ImmutableList.copyOf(cities);
	}

	public List<LocationBase> getLocations() {
		return ImmutableList.copyOf(ListUtils.union(regions, cities));
	}

	public List<Region> getRegions() {
		return ImmutableList.copyOf(regions);
	}

	public CountryDto toDto() {
		CountryDto countryDto = new CountryDto();
		countryDto.setId(getId());
		countryDto.setCode(getCode());
		countryDto.setName(getName());
		countryDto.setLatitude(getLocation().getLatitude());
		countryDto.setLongitude(getLocation().getLongitude());
		return countryDto;
	}
}