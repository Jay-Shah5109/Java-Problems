package com.streamslearn.generics;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public void singleAbstractMethod(); // only 1 abstract method
	
	public static void secondStaticMethod(){
		System.out.println("This is the second method inside the functional interface!");
	}
	
	default void thirdmethod(){
		System.out.println("This is the third method inside the functional interface!");
	}
}
