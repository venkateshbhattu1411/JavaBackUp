package com.datageeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpCompartorApp {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(1254,"Tirumal",15000f);
		Employee emp2 = new Employee(1201,"Kiran",25000f);
		Employee emp3 = new Employee(1208,"Venkat",35000f);
		Employee emp4 = new Employee(1200,"Arup",45000f);
		Employee emp5 = new Employee(1242,"Srinu",25000f);
		Employee emp6 = new Employee(1243,"Rajeev",25000f);
		Employee emp7 = new Employee(1207,"Ramesh",35000f);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		
		Collections.sort(list, (Employee emp11,Employee emp22) -> emp11.getEmployeeName().compareTo(emp22.getEmployeeName()));
		System.out.println(" \n\n Sort By Name !!!");
		list.forEach(emp -> System.out.println(emp));
		
		Collections.sort(list, (Employee emp11,Employee emp22) -> emp11.getEmployeeId().compareTo(emp22.getEmployeeId()));
		System.out.println(" \n\n Sort By Id !!!");
		list.forEach(emp -> System.out.println(emp));
	}

}
