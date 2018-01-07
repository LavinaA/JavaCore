package com.lavina.learning.Collections.Sets.Hashset;
import com.lavina.learning.office.domain.Address;

public class Employee  {

		private int id;
		private String firstName;
		private String lastName;
		private int age;
		private Float salary;
		private Address homeAddress;
		private Address officeAddress;
		
		public boolean equals(Object obj) {
			Employee e = (Employee)obj;
			return getFirstName().equals(e.getFirstName());
		}
		
		public int hashCode(){
			return getFirstName().hashCode();
		}
		public Employee(){

		}

		public Employee(int id, String firstName, String lastName, int age, float salary) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.salary = salary;
		}

		public Employee(int idx, String first ,String last, int agex ,float salaryx ,Address homex,Address officex){
			this.id = idx;
			this.firstName = first;
			this.lastName = last;
			this.age = agex;
			this.salary = salaryx;
			this.homeAddress = homex;
			this.officeAddress = officex;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Float getSalary() {
			return salary;
		}
		public void setSalary(Float salary) {
			this.salary = salary;
		}
		public Address getHomeAddress() {
			return homeAddress;
		}
		public void setHomeAddress(Address home) {
			this.homeAddress = home;
		}
		public Address getOfficeAddress() {
			return officeAddress;
		}
		public void setOfficeAddress(Address office) {
			this.officeAddress = office;
		}
		
		public String toString() {
			return "Id - " + id + "\n"
				+ "Name - " + firstName + lastName + "\n"
				+ "Age - " + age + "\n"
				+ "Salary - " + salary + "\n"
				+ "Home Address - " + homeAddress + "\n"
				+ "Office Address - " + officeAddress
				;
		}
	}


