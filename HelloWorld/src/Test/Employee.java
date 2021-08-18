package Test;

import java.util.Comparator;

//POJO

class sort_by_salary implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2){
		if(e1.getSalary()>e2.getSalary()){
			return -1;
		}
		if(e1.getSalary()<e2.getSalary()){
			return 1;
		}
		else
			return 0;
	}
	
}


class sort_by_name implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2){
		if(e1.getName().compareTo(e2.getName()))	{
			return -1;
		}
		if(e1.getName()<e2.getName()){
			return 1;
		}
		else
			return 0;
	}
	
}




public class Employee implements Comparable<Employee>{
	
	private String name;
	private int salary;
	private String city;
	private String dept;
	
	public Employee(String name, int salary, String city, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public int compareTo(Employee e){
		return this.getSalary()-e.getSalary();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + ", dept=" + dept + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
