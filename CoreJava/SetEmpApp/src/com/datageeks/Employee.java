package com.datageeks;

public class Employee  {
	
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

	public int hashCode() {
		return this.employeeId;
	}

	public boolean equals(Object obj)
	{
		Employee emp = (Employee) obj;
		return this.employeeId.equals(emp.getEmployeeId())
					&&
				this.employeeName.equals(emp.getEmployeeName());
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSal=" + employeeSal
				+ "]";
	}

}
