//This pgm shows how to use the sql queries in Java using Java8 streams...

package com.streamslearn.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee("Jay",101,101,"active",2000));
		list.add(new Employee("Rahul",102,101,"active",5000));
		list.add(new Employee("Virat",103,102,"inactive",7000));
		list.add(new Employee("MS",104,102,"active",3000));
		list.add(new Employee("Rohit",105,103,"inactive",5000));
		list.add(new Employee("Hardik",106,104,"active",9000));
		
		// to print emp details based on department --- use groupingBy function
		
		System.out.println("Printing: to print emp details based on department --- use groupingBy function");
		
		Map<Integer,List<Employee>> empListbasedonDept=list.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
		
		Map<Integer,List<Employee>> newlist18=list.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
		
		Map<String,Long> empListbasedonStatus=list.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.counting()));
		
		System.out.println("Based on status:"+empListbasedonStatus);
		System.out.println("New");
		
		System.out.println(newlist18);
		
		Iterator itr=empListbasedonDept.entrySet().iterator();
		
		while(itr.hasNext()){
			Map.Entry mapElement=(Map.Entry)itr.next();
			int key=(int)mapElement.getKey();
			List value=(List)mapElement.getValue();
			
			System.out.println(" ID: "+key+" Value: "+value);
		}
		
		// to print the count of employees working in each department --- use groupingBy function
		
		System.out.println("Printing: to print the count of employees working in each department");
		
		Map<Integer,Long> empCountBasedOnDept=list.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
		
		Iterator itr1=empCountBasedOnDept.entrySet().iterator();
		while(itr1.hasNext()){
			Map.Entry mapElement=(Map.Entry)itr1.next();
			int key=(int)mapElement.getKey();
			Long value=(Long)mapElement.getValue();
			System.out.println(" ID: "+key+" Value: "+value);
		}
					// Alternate way to print Map in JAVA 8 --- using Lambda function, forEach loop
		empCountBasedOnDept.entrySet().forEach(entry -> {
		System.out.println(entry.getKey()+" "+entry.getValue());	
		});
		
		// print active and inactive employees in given collection --- need to use filters here
		
		System.out.println("Printing: print active and inactive employees in given collection --- need to use filters here");
		
		Long empActiveCount=list.stream().filter(e->"active".equals(e.getStatus())).count(); // use of forEach in JAVA 8
		Long totalCount=list.stream().count();
		System.out.println("Active Count: "+empActiveCount);
		System.out.println("Total Count: "+totalCount);
		System.out.println("InActive Count: "+(totalCount-empActiveCount));
		
		// print the max/min salary of employee from given collection --- this will test the knowledge on Comparator,
		// and Comparable with Streams
		
		System.out.println("Printing: print the max/min salary of employee from given collection");
		
		Optional<Employee> maximumSalaryemployee=list.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println("Max Salary Employee: "+maximumSalaryemployee);
		
		Optional<Employee> minEmpSalary=list.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println("Min Salary Employee: "+minEmpSalary);
		
		Optional<Employee> max=list.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(max.get());
		
		
		// print the max salary of the employee from each department
		
		System.out.println("Printing: print the max salary of the employee from each department");
		
		Map<Integer,Optional<Employee>> maxSalaryfromEachDept=list.stream().collect(Collectors.groupingBy(Employee::getDeptId,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))
				));
		
		//Map<Integer,Optional<Employee>> newmaxsal=list.stream().collect(Collectors.groupingBy(Employee::getDeptId,max(Comparator.comparing(Employee::getSalary()))));
		
		
		
		maxSalaryfromEachDept.entrySet().forEach(entry->{
			System.out.println("Dept: "+entry.getKey()+" Max sal in dept: "+entry.getValue().get());
		});
		
		// 
		
		List<String> words=Arrays.asList("Doodle","Hello","Java","Strings with str");
		//List down all the distinct letters in the above words and take it into a list
		
		//List<String> wordslist=words.stream().map(s->s.split("")).flatMap(Arrays.stream)).distinct().collect(Collectors.toList());
		List<Integer> stringlength=words.stream().map(String::length).collect(Collectors.toList());
		stringlength.forEach(s->System.out.print(" "+s));
		
		List<List<Integer>> number = new ArrayList<>();
        
        // adding the elements to number arraylist
        number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
        System.out.println();
        
        number.stream().flatMap(s->s.stream()).collect(Collectors.toList()).forEach(s->System.out.print(s+" "));
		
		
	}

}
