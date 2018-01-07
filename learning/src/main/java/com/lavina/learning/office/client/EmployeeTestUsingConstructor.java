package com.lavina.learning.office.client;

import com.lavina.learning.office.domain.Address;
import com.lavina.learning.office.domain.Employee;

public class EmployeeTestUsingConstructor {

	public static void main(String[] args) {
		
		Address raviHomeAddress = new Address("59","Nagpur","99A" ,"Maha");
		Address raviOfficeAddress = new Address("59","Nagpur","99A" ,"Maha");
		Employee ravi = new Employee(1,"Ravi","Agrawal",27,27000.0f,raviHomeAddress,raviOfficeAddress);
		
		Address lavinaHomeAddress = new Address("59","Nagpur","99A" ,"Maha");
		Address lavinaOfficeAddress = new Address("69","Nagpur","99B" ,"Maha");
		Employee lavina = new Employee(2,"Lavi","Agrawal",26,270000.0f,lavinaHomeAddress,lavinaOfficeAddress);

		System.out.println(ravi);
		System.out.println();
		System.out.println(lavina);
				

	}

}
