package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set =new HashSet<>();
		set.add(null);
		set.add(null);
		
		List<String> list=new ArrayList<>();
		list.add(null);
		list.add(null);
		list.add("Jay");
		list.add("Rohan");
		list.add("Rahul");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(list.get(2));
		
		System.out.println("Set: "+set); // set allows only 1 null value, other null values will be rejected
		System.out.println("List: "+list); // list allows multiple null values and all null values will be accepted

	}

}
