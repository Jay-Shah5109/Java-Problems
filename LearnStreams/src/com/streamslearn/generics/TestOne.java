package com.streamslearn.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list= new ArrayList<>();
		list.add("jay");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()){
			System.out.println((String)itr.next());
		}
		
		

	}

}
