package com.sortalgo;

public class MyMergeSort {
	
	public static void merge(int arr[], int l, int m, int r){
		
		int n1=m-l+1;
		int n2=r-m;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		
		for(int i=0;i<n1;i++){
			L[i]=arr[l+i];
		}
		
		for(int j=0;j<n2;j++){
			R[j]=arr[j+m+1];
		}
		
		int i=0,j=0;
		int k=l;
		
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k]=L[i];i++;
			}
			else{
				arr[k]=R[j];j++;
			}
			k++;
		}
		
		// check for remaining elements in the array
		
		while(i<n1){
			arr[k]=L[i];
			i++;k++;
		}
		
		while(j<n2){
			arr[k]=R[j];
			j++;k++;
		}
	}
	
	
	public static void sort(int arr[], int l, int r){
		
		if(l<r){
			int m=l+(r-l)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]={4,2,1,6,7,3,2};
		int l=0;
		int r=arr.length;
		MyMergeSort.sort(arr, l, r-1);
		
		for(int i: arr){
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
