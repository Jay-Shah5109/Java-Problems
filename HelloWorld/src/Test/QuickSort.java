package Test;

public class QuickSort {
	
	
	public int partition(int h, int l, int arr[]){
		
		int pivot=arr[l];
		
		int i=l,j=h,temp;
		
		while(i<j){
			do{
				i++;
			}while(arr[i]<=pivot);
			do{
				j--;
			}while(arr[j]>pivot);
			
			if(i<j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			temp=arr[l];
			arr[l]=arr[j];
			arr[j]=temp;
		}
			
			return j;
	}
	
	public void quick_sort(int l, int h, int arr[]){
		if(l<h){
			int j=partition(h, l, arr);
			quick_sort(l, j, arr);
			quick_sort(j+1, h, arr);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={5,2,1,4,7,8,6};
		
		QuickSort qs=new QuickSort();
		qs.quick_sort(0, arr.length, arr);

	} 

}
