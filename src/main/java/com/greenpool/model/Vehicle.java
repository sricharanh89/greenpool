package com.greenpool.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6880593519048201759L;
	@NotNull
	String Model;
	String Registration_number;
	@NotNull
	String Category;
	String UserId;
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
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	
}
