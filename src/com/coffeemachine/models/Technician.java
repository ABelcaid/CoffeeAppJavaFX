package com.coffeemachine.models;

import java.util.List;

import javafx.scene.control.TextField;

public class Technician extends Person{

	private String idRef;
	private String accessCode;
	
	public Technician() {
		
	}
	public Technician(int id, String t1, String phone, String idRef, String accessCode) {
		super(id, t1, phone);
		this.idRef = idRef;
		this.accessCode = accessCode;
	}

	public String getIdRef() {
		return idRef;
	}

	public void setIdRef(String idRef) {
		this.idRef = idRef;
	}

	public String getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	@Override
	public String toString() {
		return "Technician \n********  \n name = "+name+" \n phone  =  " + phone + "  \n idRef = " + idRef + "\n accessCode = " + accessCode + " \n *****************";
	}
	public List<Technician> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	public void AddTechnician(List<Technician> technicians, Technician technician) {
		// TODO Auto-generated method stub
		
	}
}
