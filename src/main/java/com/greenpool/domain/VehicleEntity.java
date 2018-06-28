package com.greenpool.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity(name="vehicle")
public class VehicleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicle_id",nullable = false,unique = true)
	private String vehicle_id;
	@Column(name="model",nullable=false)
	String Model;
	@Column(name="registration_number")
	String Registration_number;
	@Column(name="category",nullable=false)
	String Category;
@JoinColumn(name="userId",referencedColumnName="id",nullable=false)
	String userId;
public String getVehicle_id() {
	return vehicle_id;
}
public void setVehicle_id(String vehicle_id) {
	this.vehicle_id = vehicle_id;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getRegistration_number() {
	return Registration_number;
}
public void setRegistration_number(String registration_number) {
	Registration_number = registration_number;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
}
