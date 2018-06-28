package com.greenpool.converter;

import com.greenpool.domain.VehicleEntity;
import com.greenpool.model.Vehicle;

public class VehicleConverter {

	 public static VehicleEntity convert(Vehicle vehicle){
		 
		 VehicleEntity vehicleEntity = new VehicleEntity();
		 vehicleEntity.setCategory(vehicle.getCategory());
		 vehicleEntity.setModel(vehicle.getModel());
		 vehicleEntity.setRegistration_number(vehicle.getRegistration_number());
		 vehicleEntity.setUserId(vehicle.getUserId());
		return vehicleEntity;}
	 
	 public static Vehicle convert(VehicleEntity vehicleEntity){
		 Vehicle vehicle = new Vehicle();
		 vehicle.setCategory(vehicleEntity.getCategory());
		 vehicle.setModel(vehicleEntity.getModel());
		 vehicle.setUserId(vehicleEntity.getUserId());
		 return vehicle;
	 }
}
