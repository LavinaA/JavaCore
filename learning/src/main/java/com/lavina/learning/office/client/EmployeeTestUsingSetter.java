package com.lavina.learning.office.client;

import com.lavina.learning.office.domain.Address;
import com.lavina.learning.office.domain.Employee;

public class EmployeeTestUsingSetter {

	public static void main(String[] args) {
		
		Employee ravi = new Employee();
		ravi.setId(1);
		ravi.setFirstName("Ravi");
		ravi.setLastName("Agrawal");
		ravi.setAge(27);
		ravi.setSalary(27000.0f);

		Address raviHomeAddress = new Address();
		raviHomeAddress.setBuildingNo("59");
		raviHomeAddress.setCity("Nagpur");
		raviHomeAddress.setStreetNo("99A");
		raviHomeAddress.setState("Maharashtra");
		
		ravi.setHomeAddress(raviHomeAddress);
		
		Employee lavina = new Employee();
		lavina.setId(1);
		lavina.setFirstName("Lavina");
		lavina.setLastName("Agrawal");
		lavina.setAge(26);
		lavina.setSalary(270000.0f);

		Address lavinaHomeAddress = new Address();
		lavinaHomeAddress.setBuildingNo("69");
		lavinaHomeAddress.setCity("Nagpur");
		lavinaHomeAddress.setStreetNo("99B");
		lavinaHomeAddress.setState("Maharashtra");
		
		lavina.setHomeAddress(lavinaHomeAddress);
		
		System.out.println(ravi);
		System.out.println(lavina);
				

	}

}
