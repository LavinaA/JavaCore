package com.lavina.learning.Collections.List;

import java.util.Comparator;

public class AgeCompare implements Comparator<Employee> {

	public int compare(Employee e1,Employee e2){
		int ageResult =0;
		if(e1.getAge()>e2.getAge()){
			 ageResult = 1;
		}else if (e1.getAge()<e2.getAge()){
			ageResult = -1;
		}else if (e1.getAge()==e2.getAge()){
			ageResult = 0;
		}
		return ageResult;

	}

}
	
	
	