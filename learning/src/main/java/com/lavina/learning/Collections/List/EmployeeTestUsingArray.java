package com.lavina.learning.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeTestUsingArray {
	
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		Employee ravi = new Employee(1,"Ravi","Agrawal",27,27000.0f,null,null);
		Employee lavina = new Employee(2,"Lavi","Agrawal",26,280000.0f,null,null);
		Employee amit = new Employee(3,"Amit","Agrawal",28,30000.0f,null,null);
		Employee lavina2 = new Employee(2,"Lavi","Agrawal",27,280000.0f,null,null);
		
		employees.add(ravi);
		employees.add(lavina);
		employees.add(amit);
		employees.add(lavina2);
	/*	System.out.println(employees); */
		
		System.out.println();
		System.out.println("*************Print before sorting using For Loop*************");
		for(int i = 0;i<employees.size();i++){
			Employee employee = employees.get(i);
		//	System.out.println(employee);
			System.out.println ("Employee id = " +employee.getId()+" "+
					"Employee Full Name = " +employee.getFirstName() +" " +employee.getLastName()+" "+
					"Employee Age = " +employee.getAge()+ " "+
					"Employee salary = " +employee.getSalary()+ " "+
					"Employee Home Address = "+employee.getHomeAddress()+" "+
					"Employee Office Address = "+employee.getOfficeAddress()) ; 
			
		}

		System.out.println();
		System.out.println("*************Print before sorting using For Each loop******************8");
		for(Employee e : employees) {
			System.out.println ("Employee id = " +e.getId()+" "+
					"Employee Full Name = " +e.getFirstName() +" " +e.getLastName()+" "+
					"Employee Age = " +e.getAge()+ " "+
					"Employee salary = " +e.getSalary()+ " "+
					"Employee Home Address = "+e.getHomeAddress()+" "+
					"Employee Office Address = "+e.getOfficeAddress()) ; 
		}

		System.out.println();
		System.out.println("*****************Print before sorting using Iterator**********************");
		Iterator<Employee> employeeIterator = employees.iterator();
		while(employeeIterator.hasNext()) {
			System.out.println(employeeIterator.next());
		}

		System.out.println();
		System.out.println("**********Now operating with arrays******");
		Employee [] employeeArray = new Employee [3];
		employeeArray[0] = ravi;
		employeeArray[1] = lavina;
		employeeArray[2] = amit;
		
		System.out.println();
		System.out.println("*****************Print Array before sorting using for loop**********************");
		for (int i = 0; i < employeeArray.length; i++) { 
			System.out.println(employeeArray[i]);	
		}
	
		Collections.sort(employees);
		
		System.out.println();
		System.out.println("*****************Print Array after Comparable sorting using for each**********************");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		AgeCompare ageCompare = new AgeCompare();
		Collections.sort(employees,ageCompare);
		
		System.out.println();
		System.out.println("*****************Print Array after AgeComparator sorting using for each**********************");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		Comparator<Employee> nameComparator = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		};
		Collections.sort(employees,nameComparator);
		
		System.out.println();
		System.out.println("*****************Print Array after NameComparator sorting using for each**********************");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		Comparator<Employee> salarycomparator = new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		};
		Collections.sort(employees,salarycomparator);
		
		System.out.println();
		System.out.println("*****************Print Array after SalaryComparator sorting using for each**********************");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
	}

	
}
