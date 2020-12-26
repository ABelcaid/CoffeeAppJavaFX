package com.coffeemachine.controllers;

import java.util.List;

import com.coffeemachine.interfaces.TechnicianDao;
import com.coffeemachine.models.Machine;
import com.coffeemachine.models.Product;
import com.coffeemachine.models.Technician;

public class TechnicianController implements TechnicianDao{

	@Override
	public String AddTechnician(List<Technician> technicians, Technician technician) throws Exception {
		if(technician != null) {
			technicians.add(technician);
			return "technician added  aaa! \n  ---------------- ";
		}else {
			return "Error while adding technician !";
		}
			
	}

	@Override
	public List<Technician> ShowT(Technician technician) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
