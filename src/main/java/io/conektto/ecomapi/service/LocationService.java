package io.conektto.ecomapi.service;

import java.util.List;

import io.conektto.ecomapi.model.Location;

public interface LocationService {

	public List<Location> getAllLocations();

	public Location saveLocation(Location location);

	public Boolean deleteLocation(Long locationId);

	public Location updateLocation(Location location);
}
