package com.datageeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApp {
	
	public static void main(String[] args) {
		Set<Employee> set = new LinkedHashSet<Employee>();
		Employee emp1 = new Employee(1254,"Tirumal",15000f);
		Employee emp2 = new Employee(1201,"Kiran",25000f);
		Employee emp11 = new Employee(1254,"Tirumal",15000f);
		Employee emp22 = new Employee(1201,"Kiran",25000f);
		Employee emp3 = new Employee(1208,"Venkat",35000f);
		Employee emp4 = new Employee(1200,"Arup",45000f);
		
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp11);
		set.add(emp22);
		set.add(emp3);
		set.add(emp4);
		
		set.forEach(emp -> System.out.println(emp));
		
		Employee emp33 = new Employee(1201,"Kiran",25000f);
		System.out.println(" Contains emp33 => "+set.contains(emp33));
	}

}
