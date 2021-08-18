package Test;

public class MergeLists {
	
	public void merge(int arr[], int l, int m, int r){
		
		int i=l;
		int j=m+1;
		int k=l;
		
		int b[]=new int[arr.length];
		
		while(i<=m && j<=r)
		
		{
			if(arr[i]<arr[j]){
				b[k]=arr[i]; i++;
			}
			else{
				b[k]=arr[j]; j++;
			} 
			
			k++;
		}
		
		if(i>m){
			while(j<=r){
				b[k++]=arr[j++];
			}
		}else{
			while(i<=m){
				b[k++]=arr[i++];
			}
		}
		
		
		
		for(k=l;k<=r;k++){
			arr[k]=b[k];
		}
			
	}
	
	
	public void sort(int arr[], int l, int r){
		if(l<r){
			int m=l+(r-l)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
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
		
		/*int arr1[]={6};
		int arr2[]={9};
		
		int i=0,j=0,k=0,n1=arr1.length,n2=arr2.length;

		int arr3[]= new int[arr1.length+arr2.length];
		
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr3[k++]=arr1[i++];
			}
			else{
				arr3[k++]=arr2[j++];
			}
		}
		
		while(i<arr1.length){
			arr3[k++]=arr1[i++];
		}
		
		while(j<arr2.length){
			arr3[k++]=arr2[j++];
		}
		
		
		
		for(Integer x:arr3){
		System.out.println(x);
		}*/
		
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		
		
		 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeLists ob = new MergeLists();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
	}
	
	

}
