package com.lavina.learning.office.client;

import java.util.ArrayList;
import java.util.List;

import com.lavina.learning.office.domain.Address;
import com.lavina.learning.office.domain.Department;
import com.lavina.learning.office.domain.Employee;
import com.lavina.learning.office.domain.Office;
import com.lavina.learning.office.domain.Team;

public class Client {

	public static void main(String[] args) {

		Office HSBC = new Office("HSBC",15);
		Address adr = new Address("99","51","Nagpur","Maha");
		
		HSBC.setOfficeAddress(adr); 
		
		
		ArrayList<Department> departments = new ArrayList<Department>();
		Department Finance = new Department("Finance",1);
		Department IT = new Department("IT",2);
		departments.add(Finance);
		departments.add(IT);
		HSBC.setDepts(departments);
		
		
		ArrayList<Team> teamsInIT = new ArrayList<Team>();
	    Team RPS = new Team("RPS",3);
		Team Audit = new Team("Audit",4);
		teamsInIT.add(RPS);
		teamsInIT.add(Audit);
		IT.setTeams(teamsInIT);
		
		ArrayList<Team> teamsInFinance = new ArrayList<Team>();
	    Team accounts = new Team("Accounts",4);
		teamsInFinance.add(accounts);
		Finance.setTeams(teamsInFinance);
		
		
		ArrayList<Employee> employeesInRPS = new ArrayList<Employee>();
		ArrayList<Employee> employeesInAudit = new ArrayList<Employee>();
		ArrayList<Employee> employeesInAccounts = new ArrayList<Employee>();

		Employee lavina = new Employee(1,"lavina","Agrawal",26,2000);
		Employee rakesh = new Employee(2,"Rakesh","Lodha",27,25000);
		Employee vidya = new Employee(3,"Vidya","Lokhande",27,26000);
		Employee sagar = new Employee(4,"Sagar","Accounts",30,26000);


		
		Address lavinaHomeAddr = new Address("J18","99","Pune","Maha");
		Address lavinaOfficeAddr = new Address("P18","29","Pune","Maha");
		lavina.setHomeAddress(lavinaHomeAddr);
		lavina.setOfficeAddress(lavinaOfficeAddr);
		
		Address rakeshHomeAddr = new Address("J19","100","Pune","Maha");
		Address rakeshOfficeAddr = new Address("P18","29","Pune","Maha");
		rakesh.setHomeAddress(rakeshHomeAddr);
		rakesh.setOfficeAddress(rakeshOfficeAddr);
		
		Address vidyaHomeAddr = new Address("J20","101","Pune","Maha");
		Address vidyaOfficeAddr = new Address("P18","29","Pune","Maha");
		vidya.setHomeAddress(vidyaHomeAddr);
		vidya.setOfficeAddress(vidyaOfficeAddr);
		
		Address sagarHomeAddr = new Address("J21","102","Pune","Maha");
		Address sagarOfficeAddr = new Address("P18","29","Pune","Maha");
		sagar.setHomeAddress(sagarHomeAddr);
		sagar.setOfficeAddress(sagarOfficeAddr);
		
		employeesInRPS.add(rakesh);
		employeesInRPS.add(lavina);
		employeesInAudit.add(lavina);
		employeesInAudit.add(vidya);
		employeesInAccounts.add(sagar);
		
		RPS.setEmp(employeesInRPS);
		Audit.setEmp(employeesInAudit);
		accounts.setEmp(employeesInAccounts);
		
		/*System.out.println(HSBC);*/
		
		int OfficeId = HSBC.getId();
		System.out.println("office ID " +OfficeId);
		
		String officeName = HSBC.getName();
		System.out.println("OfficeName=" +officeName);
		
		Address officeAddress = HSBC.getOfficeAddress();
		System.out.println("Office Address = "+officeAddress);
		
		List <Department> depts = HSBC.getDepts();
				
	   for (Department dept:depts)
		{
		   int deptId = dept.getId();
		   String deptName = dept.getName();
		   System.out.println("Department Name = " +deptName);
		   System.out.println("Department ID = "+deptId);
		    List<Team> teams = dept.getTeams();
		    for (Team team : teams)
		     {
		    	int teamId = team.getId();
		    	String teamName = team.getName();
		    	System.out.println("Team Id = "+teamId);
		    	System.out.println("Team Name = "+teamName);
		    	List<Employee> emps = team.getEmp();
		    	for(Employee emp:emps)
		    	{
		    		System.out.println("Employee Id " +emp.getId()); 
		    		System.out.println("Employee First Name " +emp.getFirstName());
		    		System.out.println("Employee Last Name " +emp.getLastName());
		    		System.out.println("Employee Age " +emp.getAge());
		    		System.out.println("Employee Salary " +emp.getSalary());
		    		System.out.println("Employee Home Address " +emp.getHomeAddress());
		    		System.out.println("Employee Office Address " +emp.getOfficeAddress());
		    	}
		     }
   		}
		
	}

}
