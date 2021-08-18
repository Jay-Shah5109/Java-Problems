package com.sortalgo;

public class MergeSort {
	
	void merge(int arr[], int l, int m, int r){
		int n1=m-l+1;
		int n2=r-m;
		
		int L[]= new int[n1];
		int R[]= new int[n2];
		
		for(int i=0;i<n1;i++){
			L[i]=arr[i+l];
		}
		
		for(int j=m;j<=r;j++){
			L[j]=arr[m+1+j];
		}
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
