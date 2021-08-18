package com.sortalgo;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,5,2,3,7,6,4,8,2,3};
		//int j=0;
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int j=i-1;
			while(arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
		for(int i:arr){
			System.out.print(i+" ");
			}
		

	}

}
