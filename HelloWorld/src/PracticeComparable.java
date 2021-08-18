import java.util.*;
import java.io.*;

class Employee implements Comparable<Employee>{
	
	private int empid;
	private String empname;
	private String address;
	
	public Employee(int empid, String empname, String address) {
		//super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
	}	
	
	//sort on the basis of employee ID
	
	public int compareTo(Employee e2){
		
		if(this.getEmpid()>e2.getEmpid())
			return 1;
		else 
			return -1;
	}
	
}

public class PracticeComparable {
	
	
	public static void main(String[] args) {
	
	Employee e1=new Employee(1,"Jay1","Mumbai1");
	Employee e2=new Employee(2,"Jay2","Mumbai2");
	Employee e3=new Employee(3,"Jay3","Mumbai3");
	Employee e4=new Employee(5,"Jay5","Mumbai5");
	Employee e5=new Employee(7,"Jay7","Mumbai7");
	Employee e6=new Employee(4,"Jay4","Mumbai4");
	Employee e7=new Employee(6,"Jay6","Mumbai6");
	
	List<Employee> mynewlist = new ArrayList<>();
	
	mynewlist.add(e1);
	mynewlist.add(e2);
	mynewlist.add(e3);
	mynewlist.add(e4);
	mynewlist.add(e5);
	mynewlist.add(e6);
	mynewlist.add(e7);
	
	Collections.sort(mynewlist);
	
	for(Employee emp:mynewlist){
		System.out.println(emp);
	}
	
	}
}
