// Kadane Algorithm

public class LargestContinuousSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={-2, -3, 4, -1, -2, 1, 5, -3,19,2,-10};
		int max_sum_till_now=0,current_sum=0;
		
		for(int i=0;i<arr.length;i++){
			
			max_sum_till_now=max_sum_till_now+arr[i];
			
			if(current_sum<max_sum_till_now){
				current_sum=max_sum_till_now;
				//index=i;
			}
			
			if(max_sum_till_now<0){
				max_sum_till_now=0;
			}
			
		}
		
		System.out.println(current_sum);

	}

}
