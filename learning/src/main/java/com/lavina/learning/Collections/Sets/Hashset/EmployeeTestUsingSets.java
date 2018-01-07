package com.lavina.learning.Collections.Sets.Hashset;
import java.util.HashSet;
import java.util.Set;

public class EmployeeTestUsingSets {
	
	public static void main(String[] args) {

		Set<Employee> employees = new HashSet<>();
		Employee ravi = new Employee(1,"Ravi","Agrawal",27,27000.0f,null,null);
		Employee lavina = new Employee(2,"Lavi","Agrawal",26,280000.0f,null,null);
		Employee lavina2 = new Employee(2,"Lavi","Agrawal",27,280000.0f,null,null);
		
		employees.add(ravi);
		employees.add(lavina);
		employees.add(lavina2);
		System.out.println(employees);
	}

}
		

