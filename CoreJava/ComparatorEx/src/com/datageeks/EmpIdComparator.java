package com.datageeks;

import java.util.Comparator;

public class EmpIdComparator  implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEmployeeId().compareTo(emp2.getEmployeeId());
	}

}
