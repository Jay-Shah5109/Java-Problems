package com.streamslearn.generics;

import java.util.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[]={1,2,3,5,6,7,8,32,12};
		
		int mid=(array.length/2)-1;
		int temp,i,j;
		System.out.println("Previous array:");
		for(int x: array){
			System.out.println(x);
		}
		for(i=0,j=array.length-1;i<=(mid) && j>mid ;i++,j--){
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		System.out.println("After reversing:");
		for(int x: array){
			System.out.println(x);
		}
		
		int arr[]={10,10,7,1,4,6,5,8,3,1,10};
		int sum=11;
		for(int m=0;m<arr.length;m++){
			for(int n=m;n<arr.length;n++){
				if(sum==(arr[m]+arr[n])){
					System.out.println("Pair: "+arr[m]+" "+arr[n]);
				}
			}
		}
		
		List<Integer> age=Arrays.asList(50,51,10,20,55,76,12,16);
		
		age.stream().filter(s->s>50).forEach(s->System.out.println(s));
		
		
		MyClassNew my1=MyClassNew.getInstance();
		System.out.println(my1);
		
		
		
		

	}
	
	

}


class MyClassNew{
	
	static MyClassNew obj;
	
	private MyClassNew(){
		
	}
	
	static MyClassNew getInstance(){
		if(obj==null){
			obj=new MyClassNew();
		}
		return obj;
	}

}
