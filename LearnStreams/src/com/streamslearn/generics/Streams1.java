package com.streamslearn.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//import package com.streamslearn.generics;

public class Streams1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<String> list=new ArrayList<>();
		list.add("Rajiv");
		list.add("Ramesh");
		list.add("Jay");
		list.add("Rohan");
		list.add("Rahul");
		list.add("Rahul");
		list.add("Rahul");
		
		
		int arr[]={1,2,3,4,5,6};
		
		
		List<Employee> newlist=new ArrayList<Employee>();
		
		newlist.add(new Employee("Jay",101,101,"active",2000));
		newlist.add(new Employee("Rahul",102,101,"active",5000));
		newlist.add(new Employee("Virat",103,102,"inactive",7000));
		newlist.add(new Employee("MS",104,102,"active",3000));
		newlist.add(new Employee("Rohit",105,103,"inactive",5000));
		newlist.add(new Employee("Hardik",106,104,"active",9000));
		
		
		List<String> newlist1=list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		List<String> list_rahul=list.stream().filter(s->s.contains("Rahul")).map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(newlist1);
		System.out.println(list_rahul);
		
		System.out.println("Sum of all numbers is:"+Arrays.stream(arr).reduce(0, (a,b)->a+b));
		
		System.out.println("Max element of all numbers is:"+Arrays.stream(arr).reduce(0, (a,b)->a>b?a:b));
		
		
		//List<Employee> employeelist=newlist.stream().collect(Collectors.groupingBy());
		
		
		
		
	}

}
