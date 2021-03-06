package com.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDatabase {
	
	public static List<Customer> getAll(){
		
		return Stream.of(
				new Customer(101,"jay","jaysh@amdocs.com",Arrays.asList("99223123","992312122")),
				new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
				).collect(Collectors.toList());
	}
}
