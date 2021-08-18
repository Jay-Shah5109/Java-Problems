
public class MaxSumSubArray {
	
	public int sumofAllElements(int arrtemp[], int start, int last){
		
		int sumofall=0;
		for(int i=start;i<=last;i++){
			sumofall=sumofall+arrtemp[i];
		}
		//System.out.println(sumofall);
		return sumofall;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxSumSubArray maxsumsubarray=new MaxSumSubArray();
		
		//int[] arr={ -2, 1, -3, 4, -1, 2, 1, -5, 4}; // wikipedia example
		
		//int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
		
		int arr[]={5, 7, -3, 2, 9, 6, 16, 22, 21, 29, -14, 10, 12};
		
		int firstpositiveindex=0,maxsum=0,tempsum=0,lastpositiveindex=arr.length,backwardsum=0;
		
		// searching for the first positive index....
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0)
				continue;
			else
			{
				firstpositiveindex=i;
				break;
			}
		}
		
		System.out.println("FPI is"+firstpositiveindex);
		
		// search for the index, from which the sum from backwards is 0 
		if(arr[arr.length-1]>=0)
		{
			for(int i=arr.length-1;i>=0;i--){
				
				backwardsum=backwardsum+arr[i];
				if(backwardsum==0){
					lastpositiveindex=i;
					break;
				}
			}
			System.out.println("LPI is"+lastpositiveindex);
		}
		else
		{
			//find last positive index...
			for(int i=arr.length-1;i>=0;i--){
				if(arr[i]<0)
					continue;
				else
				{
					lastpositiveindex=i;
					break;
				}
			}
			System.out.println("LPI is"+lastpositiveindex);
		}
		
		for(int j=firstpositiveindex;j<arr.length;j++){
			
			tempsum=maxsumsubarray.sumofAllElements(arr,j,lastpositiveindex);
			if(tempsum>maxsum){
				maxsum=tempsum;
			}
		}
		
		System.out.println(maxsum);
	}

}
