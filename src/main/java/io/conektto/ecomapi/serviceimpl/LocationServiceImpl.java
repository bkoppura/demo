package io.conektto.ecomapi.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.conektto.ecomapi.exception.LocationException;
import io.conektto.ecomapi.model.Location;
import io.conektto.ecomapi.repository.LocationRepository;
import io.conektto.ecomapi.service.LocationService;
import io.conektto.ecomapi.util.Constents;

@Service
public class LocationServiceImpl implements LocationService{
	
	
	private LocationRepository locationRepository;

	public LocationServiceImpl(LocationRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}
	
	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}


	@Override
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

	@Override
	public Boolean deleteLocation(Long locationId) {
		Optional<Location> opt_location = locationRepository.findById(locationId);
		if (opt_location.isPresent()) {
			locationRepository.delete(opt_location.get());
		} else {
			throw new LocationException(Constents.LOCATION_NOT_FOUND);
		}
		return Boolean.TRUE;
	}

	@Override
	public Location updateLocation(Location location) {
		Optional<Location> opt_location = locationRepository.findById(location.getLocationID());
		Location locationTemp = null;
		if (opt_location.isPresent()) {
			Location actual = opt_location.get();
			actual.setName(location.getName());
			actual.setCostRate(location.getCostRate());
			actual.setAvailability(location.getAvailability());
			actual.setModifiedDate(location.getModifiedDate());
			locationTemp = locationRepository.save(actual);
		} else {
			throw new LocationException(Constents.LOCATION_NOT_FOUND);

		}
		return locationTemp;
	}
	

}
