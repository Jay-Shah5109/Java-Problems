package com.sortalgo;

public class HeapSort {
	
	public void sort(int arr[]){
		
		int n=arr.length;
		for(int i=n/2-1 ; i>=0 ; i--){	
			heapify(arr,n,i);
		}
		for(int i=n-1; i>0; i--){
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			heapify(arr, i,0);
		}
	}
	
	public void heapify(int arr[], int n, int i){
		
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && arr[largest]<arr[left]){
			largest=left;
		}

		if(right<n && arr[largest]<arr[right]){
			largest=right;
		}
		
		if(largest!=i){
			int swap=arr[largest];
			arr[largest]=arr[i];
			arr[i]=swap;
			
			heapify(arr, n ,largest);
		}
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
 
        HeapSort ob = new HeapSort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);

	}

}
