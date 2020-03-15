package com.iv.org.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.iv.org.biz.entity.EmployeeEntity;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public EmployeeEntity getEmpById(String empId) {
		
		EmployeeEntity emp1 = new EmployeeEntity();
		emp1.setEmpId("2115");
		emp1.setEmpName("Mohan Raju G");
		
		EmployeeEntity emp2 = new EmployeeEntity();
		emp2.setEmpId("2115");
		emp2.setEmpName("Mohan Raju G");
		
		EmployeeEntity emp3 = new EmployeeEntity();
		emp3.setEmpId("2115");
		emp3.setEmpName("Mohan Raju G");
		
		List<EmployeeEntity> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		Optional<EmployeeEntity> optional = empList.stream().filter(entity -> empId.equals(entity.getEmpId())).findFirst();
		return optional.get();
	}

}
