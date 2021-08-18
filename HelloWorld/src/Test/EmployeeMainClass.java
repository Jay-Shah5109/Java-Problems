package Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMainClass {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		List<Employee> newlist=new ArrayList<>();
		
		newlist.add(new Employee("Jay",1000,"Mumbai","CS"));
		newlist.add(new Employee("Raj",10000,"Chennai","IT"));
		newlist.add(new Employee("Rahul",8000,"Mumbai","EXTC"));
		newlist.add(new Employee("Rajesh",1000,"Kolkata","CS"));
		newlist.add(new Employee("Jayesh",6000,"Chennai","EXTC"));
		newlist.add(new Employee("Abhi",5000,"Mumbai","IT"));
		newlist.add(new Employee("Sai",6000,"Delhi","CS"));
		newlist.add(new Employee("John",9000,"Delhi","EXTC"));
		
		List<Integer> intlist=Arrays.asList(1,3,4,5,7,7,4,3,2,56,7,8,5,3,7,8,5);
		
		List<String> stringlist=Arrays.asList("54","45","99");
		
		
		//print all employees with salary greater than equal to 2000
		System.out.println("All employees with salary greater than equal to 2000 and IT Dept:");
		List<Employee> salary_greater_2000=newlist.stream().filter(s->s.getSalary()>=2000 && s.getDept().equals("IT")).collect(Collectors.toList());
		for(Employee e: salary_greater_2000){
			System.out.println(e.getName());
		}
		
		System.out.println();
		
		// group by all employees by department
		System.out.println("Group by all employees by department");
		Map<String,List<Employee>> emp_by_dept=newlist.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.toList()));
		System.out.println(emp_by_dept);
		
		//avg of all salaries with employees having city=mumbai
		System.out.print("Average of all salaries of Mumbai Employees is:");
		Double avg_sal_mumbai=newlist.stream().filter(s->s.getCity().equals("Mumbai")).collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println(avg_sal_mumbai);
		
		//print name of the employee in Mumbai with max and min salary -- two seperate statements
		
		Optional<Employee> employee_Mum_max_sal=newlist.stream().filter(s->s.getCity().equals("Mumbai")).collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(employee_Mum_max_sal.isPresent()?employee_Mum_max_sal.get():"Not Applicable");
		
		// print the max salaries of all employees
		
		Optional<Employee> max_sal_all=newlist.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(max_sal_all);
		
		
		// find sum of all num of 'intlist' list
		
		int sum_all=intlist.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum_all);
		
		// find sum of all even numbers from intlist
		
		int sum_even=intlist.stream().filter(s->s%2==0).reduce(0, (a,b)->a+b);
		System.out.println(sum_even);
		
		
		int sum_odd=intlist.stream().filter(s->s%2!=0).reduce(0, (a,b)->a+b);
		System.out.println(sum_odd);
		
		System.out.println(sum_even+sum_odd);
		
		
		// average of all salaries of all employees
		
		double avg_sal=newlist.stream().collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println(avg_sal);
		
		// MAP: create a list of all salaries of emp*5 i.e. sal*5
		
		List<Integer> salary_multiply_five=newlist.stream().map(s->s.getSalary()*5).collect(Collectors.toList());
		System.out.println(salary_multiply_five);
		
		
		// MAP: Get a list of names of all employees that start with 'R' and put it into a list
		
		long emp_start_R=newlist.stream().filter(s->s.getName().startsWith("R")).map(s->s.getName()).collect(Collectors.counting());
		System.out.println(emp_start_R);
		
		//Find sum of salaries of all employees working in EXTC dept
		
		int sum_sal_extc=newlist.stream().filter(s->s.getDept().equals("EXTC")).collect(Collectors.summingInt(Employee::getSalary));
		System.out.println(sum_sal_extc);
		
		// Convert the stringlist which contains the string of integers to integer list
		
		List<Integer> string_to_intlist=stringlist.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println(string_to_intlist);
		
		// Number of employees living in Mumbai with salary>1000
		
		long emp_mum_sal_gre_1000=newlist.stream().filter(s->s.getCity().equals("Mumbai") && s.getSalary()>1000).collect(Collectors.counting());
		System.out.println(emp_mum_sal_gre_1000);
		
		// sum of sal of all employees with sal>3000
		
		long sum_emp_sal_gre_3000=newlist.stream().filter(s->s.getSalary()>3000).collect(Collectors.summingInt(Employee::getSalary));
		System.out.println(sum_emp_sal_gre_3000);
		
		// max of all salaries in mumbai
		
		Optional<Employee> max_sal_mum=newlist.stream().filter(s->s.getCity().equals("Mumbai")).collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(max_sal_mum);
		
		// use comparator and comparing, to print the max salaries of all the employees working in Mumbai  
		
		Optional<Employee> max_sal_emp_mum= newlist.stream().filter(s->s.getCity().equals("Mumbai")).collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(max_sal_mum);
		
		Collections.sort(newlist);
		
		System.out.println("Employee list after sorting:");
		
		for(Employee e:newlist){
			System.out.println(e);
		}
		
		
		sort_by_salary s=new sort_by_salary();
		Collections.sort(newlist,s);
		System.out.println("Employee list after sorting using Comparator:");
		for(Employee e:newlist){
			System.out.println(e);
		}
		
		
		System.out.println("Get the max salary from each city and print ouptut in the form of <Integer, Employee>");
	// Get the max salary from each city and print ouptut in the form of <Integer, Employee>
		
		Map<String,Optional<Employee>> max_sal_from_city=newlist.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		
		Iterator itr=max_sal_from_city.entrySet().iterator();
		
		while(itr.hasNext()){
			
			Map.Entry mapelement=(Map.Entry)itr.next();
			System.out.println("Key: "+mapelement.getKey());
			System.out.println("Value: "+mapelement.getValue());
			
		}
		
		// using lambda function
		
		max_sal_from_city.entrySet().forEach(a->{
			System.out.println("Key: "+a.getKey()+"Value: "+a.getValue());
			});
		
		
		File fileName= new File("C:\\Users\\JAYSH\\OneDrive - AMDOCS\\Backup Folders\\Desktop\\Personal Docs\\CAT 2021\\test.txt");
		
		List<String> text=Files.readAllLines(fileName.toPath());
		
		text.parallelStream().forEach(System.out::println);
		
		System.out.println("Output as of stream operation:");
		text.stream().forEach(System.out::println);
		
		
		// Print the average salary in each city of the form: <City,AverageSalary>
		
		
		Map<String,Double> average_salary_each_city=newlist.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.averagingInt(Employee::getSalary)));
		
		average_salary_each_city.entrySet().forEach(a->{
			System.out.println("Key: "+a.getKey()+"Value: "+a.getValue());
		});
		
		
		List<Integer> list_of_integers=Arrays.asList(2,3,4,5,6,7,4,2,3,5,7,7);
		int sumnew=list_of_integers.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b);
		System.out.println(sumnew);
		
		
		List<String> list_of_Strings= new ArrayList<>();
		list_of_Strings.add("jay");
		list_of_Strings.add("jay2");
		list_of_Strings.add("jay4");
		list_of_Strings.add("jay3");
		list_of_Strings.add("jay7");
		
		//use map to capitalize all the strings in list_of_Strings
		
		List<String> n=list_of_Strings.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(n);
		
		
		
		File employeefile = new File("C:\\Users\\JAYSH\\OneDrive - AMDOCS\\Backup Folders\\Desktop\\Personal Docs\\CAT 2021\\test.txt");
		List<String> textnew=Files.readAllLines(employeefile.toPath());
		
		System.out.println(textnew);
		
		Iterator itrnew=textnew.iterator();
		
		int salarysum=0;
		String[] tempstr; 
		
		while(itrnew.hasNext()){
			if(itrnew.hasNext()){
			String texttemp=(String)itrnew.next();
				tempstr=texttemp.split(",",5);
				salarysum=salarysum+Integer.parseInt(tempstr[4]);
		}
		}
		
		System.out.println("Sum of all ages is: "+salarysum);	
		
		Optional<String> name=Optional.of("Jay");
		Optional<String> name1=null;
		
		System.out.println(Optional.ofNullable(name1));
		
		
		List<String> oldstring=Arrays.asList("Jay","Rohit","Virat","Hardik");
		List<String> newstring=oldstring.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(newstring);
		
		//sort all the employees salaries and put it into a list
	
		//List<Integer> sorted_salaries=newlist.stream().collect(Comparator.comparing(Employee::getSalary));
		
		//System.out.println(sorted_salaries);
		
		sort_by_salary sbs=new sort_by_salary();
		
		Collections.sort(newlist,sbs);
		
		for(Employee e:newlist){
			System.out.println(e);
		}
		
		// Optional class usage
		
		//Employee e8= new Employee(null,1000,null,null);
		
		//String newoptional=Optional.ofNullable(e8.getName()).orElseThrow(()->new IllegalArgumentException("nothing present"));
		//System.out.println(newoptional);
		
		// Group by salaries and cities
		
		Map<String,List<Employee>> groupbysalariesncities=newlist.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.toList())); 
		System.out.println(groupbysalariesncities);
		
		
		double avg_sal_mum=newlist.stream().filter(s1->s1.getCity().equals("Mumbai")).collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println("The average salary in Mumbai is: "+avg_sal_mum);
		
		
		Employee enew=new Employee("Ramesh", 10, null, null);
		String optionalname=Optional.ofNullable(enew.getName()).orElseThrow(()-> new ArithmeticException("Cannot get name"));
		System.out.println(optionalname);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
