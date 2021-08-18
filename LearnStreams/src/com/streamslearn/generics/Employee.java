package com.streamslearn.generics;

public class Employee {
	
	private String empName;
	private int empId;
	private int deptId;
	private String status="active";
	private int salary;
	
	public Employee(String empName, int empId, int deptId, String status, int salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", deptId=" + deptId + ", status=" + status
				+ ", salary=" + salary + "]";
	}

}
