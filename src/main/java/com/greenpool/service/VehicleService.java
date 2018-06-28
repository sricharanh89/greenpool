package com.greenpool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenpool.dao.VehicleDao;
import com.greenpool.model.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleDao vehicleDao;
	
	public void saveVehicle(Vehicle vehicle) {
		vehicleDao.save(vehicle);
	}

	public List<Vehicle> getVehicles(String userId) {

		return vehicleDao.getVehicles(userId);
	}

}
