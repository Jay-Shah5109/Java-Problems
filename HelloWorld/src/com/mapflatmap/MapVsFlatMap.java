package com.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> customers=EKartDatabase.getAll();
		
		// Now we need to convert List<Customer>  -----> List<String> ------> Data Tranformation

		//mapping Logic: customer->customer.getEmail() ---> this is one to one mapping, since each customer has one email id	
		//mapping Logic: customer->customer.getPhoneNumbers() ---> this is one to many mapping, since each customer has many phone numbers
	
		List<List<String>> phones = customers.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phones);	
		
		
		// For one to many mapping, use the flatMap structure.
		System.out.println("The flatMap structure is used below-----------");
		List<String> flatmapphones = customers
				.stream()
				.flatMap(customer->customer.getPhoneNumbers().stream()) // converts the stream to single stream ---- Data flattering
				.collect(Collectors.toList());
		System.out.println(flatmapphones);
	}
}
