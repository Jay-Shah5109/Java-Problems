package HelloWorld.src;
public class BinarySearchInRotatedAndSortedArray {
	public static boolean binarySearch(int arr[], int key){
		int low=0,high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]==key){
				return true;
			}
			if(arr[mid]>=arr[low]){
				// this condition means that the left part of array is sorted
				if(key>=arr[low] && key<arr[mid])
					high=mid-1;
				else
					low=mid+1;
			}
			else{
				if(key>=arr[mid] && key<=arr[high])
					low=mid+1;
				else
					high=mid-1;
			}
		}	
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int arr[]={120,130,40,50,60,100};
		int key=130;
		System.out.println("Is the data present? "+BinarySearchInRotatedAndSortedArray.binarySearch(arr, key));
	}
}
