package io.conektto.ecomapi.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import io.conektto.ecomapi.model.Location;
import io.conektto.ecomapi.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/location")
public class LocationController {

	private LocationService locationService;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public LocationController(LocationService locationService) {
		super();
		this.locationService = locationService;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		// Log a simple message
		log.debug("debug level log");
		log.info("info level log");
		log.error("error level log");

		// Log a formatted string with parameters
		log.info("another info log with {}, {} and {} arguments", 1, "2", 3.0);

		return "logging";
	}
	
	
	@GetMapping("/locationlist")
	@ResponseBody
	public ResponseEntity<List<Location>> getAllLocations(){
        List<Location> locationList = locationService.getAllLocations();
        return new ResponseEntity<List<Location>>(locationList, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Location> saveLocation(@RequestBody Location location){
			
		return new ResponseEntity<Location>(locationService.saveLocation(location),HttpStatus.CREATED);
	}
	
	@PutMapping(value="/update",consumes= {"application/json"},produces= {"application/json"})
    @ResponseBody
    public ResponseEntity<Location> updateLocation(@RequestBody Location location,UriComponentsBuilder builder){
		Location updatedLocation=locationService.updateLocation(location);
    	return new ResponseEntity<Location>(updatedLocation,HttpStatus.CREATED);
    }
	
	@DeleteMapping(value="/delete/{locationId}")
	@ResponseBody
	public ResponseEntity<Boolean> deleteLocation(@PathVariable Long locationId){
    	Boolean isDeleted=locationService.deleteLocation(locationId);
    	return new ResponseEntity<Boolean>(isDeleted,HttpStatus.OK);
    }
	
	//@PatchMapping(value="/{locationId}")
	
}
