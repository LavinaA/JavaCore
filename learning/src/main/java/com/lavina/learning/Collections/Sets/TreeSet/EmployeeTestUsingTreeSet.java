package com.lavina.learning.Collections.Sets.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTestUsingTreeSet {
	
	public static void main(String[] args) {

		Set<Employee> employees = new TreeSet<>();
		Employee ravi = new Employee(1,"Ravi","Agrawal",27,27000.0f,null,null);
		Employee lavina = new Employee(2,"Lavi","Agrawal",26,280000.0f,null,null);
		Employee amit = new Employee(2,"Amit","Agrawal",26,280000.0f,null,null);
		Employee lavina2 = new Employee(2,"Lavi","Agrawal",27,280000.0f,null,null);
		
		employees.add(ravi);
		employees.add(lavina);
		employees.add(lavina2);
		employees.add(amit);
		
		System.out.println(employees);
	}

}
		

