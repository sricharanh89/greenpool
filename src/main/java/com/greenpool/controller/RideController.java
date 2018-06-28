package com.greenpool.controller;

import com.greenpool.model.Ride;
import com.greenpool.model.ShareRide;
import com.greenpool.model.Vehicle;
import com.greenpool.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
public class RideController {

	@Autowired
	VehicleService vehicleService;
	
	@RequestMapping(value = "bookride",method = RequestMethod.POST,produces = {"application/json"})
	public ResponseEntity<?> bookRide(@RequestBody Ride ride){
		return ResponseEntity.ok().body(HttpStatus.CREATED);
	}
	@RequestMapping(value = "shareride",method = RequestMethod.POST,produces = {"application/json"})
	public ResponseEntity<?> shareRide(@RequestBody ShareRide ride){
		return ResponseEntity.ok().body(HttpStatus.CREATED);
	}

	@RequestMapping(value = "cancelride",method = RequestMethod.PUT,produces = {"application/json"})
	public ResponseEntity<?> cancelRide(@RequestParam(required = true) String bookingId){
		return ResponseEntity.ok().body(HttpStatus.ACCEPTED);

	}

	
}
