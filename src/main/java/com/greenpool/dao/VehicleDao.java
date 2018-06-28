package com.greenpool.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.greenpool.converter.VehicleConverter;
import com.greenpool.domain.VehicleEntity;
import com.greenpool.model.Vehicle;
import com.greenpool.repository.VehicleRepository;

@Component
public class VehicleDao {

	@Autowired
	VehicleRepository vehicleRepository;
	public void save(Vehicle vehicle) {
		VehicleEntity vehicleEntity = VehicleConverter.convert(vehicle);
		//VehicleEntity entity = vehicleRepository.findByUserId(vehicleEntity.getUserId());
		vehicleRepository.save(vehicleEntity);
	}

	public List<Vehicle> getVehicles(String userId) {
		List<Vehicle> vehicles = new ArrayList<>();
		List<VehicleEntity> vehicleEntities=vehicleRepository.findByUserId(userId);
		if(!vehicleEntities.isEmpty()){
			
			for(VehicleEntity entity : vehicleEntities){
				vehicles.add(VehicleConverter.convert(entity));
			}
		}
		return vehicles;
	}

	
}
