package com.sortalgo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={4,5,6,2,8};
		
		// find minimum from the array and then place it at the beginning of the array, then increment
		// the starting index by 1
		
		for(int i=0;i<array.length-1;i++){
			int min_index=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min_index])
					min_index=j;
			}
				int temp=array[i];
				array[i]=array[min_index];
				array[min_index]=temp;
				
			}
		for(int m:array){
			System.out.print(array[m]+" ");
		}

	}

}
