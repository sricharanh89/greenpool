package com.greenpool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greenpool.model.Vehicle;
import com.greenpool.service.VehicleService;

@RestController
@RequestMapping("/v1/")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@RequestMapping(value = "registervehicle",method = RequestMethod.POST,produces = {"application/json"})
	public ResponseEntity<?> registerVehicle(@RequestBody Vehicle vehicle){
		
		vehicleService.saveVehicle(vehicle);
		return ResponseEntity.ok().body(HttpStatus.CREATED);
		
		
	}
	@RequestMapping(value = "vehicles",method = RequestMethod.GET,produces = {"application/json"})
	public ResponseEntity<?> getVehicle(@RequestParam(required = true) String userId){
		return ResponseEntity.ok().body(vehicleService.getVehicles(userId));
		
	}
	
}
