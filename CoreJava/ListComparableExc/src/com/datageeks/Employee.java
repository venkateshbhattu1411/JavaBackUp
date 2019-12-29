package com.datageeks;

public class Employee implements Comparable<Employee> {
	
	private Integer employeeId = null;
	private String employeeName = null;
	private Float employeeSal = null;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(Integer employeeId, String employeeName, Float employeeSal) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
	}


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public Float getEmployeeSal() {
		return employeeSal;
	}


	public void setEmployeeSal(Float employeeSal) {
		this.employeeSal = employeeSal;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSal=" + employeeSal
				+ "]";
	}


	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.employeeId.compareTo(emp.getEmployeeId());
	}
	
	
	

}
