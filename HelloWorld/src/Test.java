
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]={6,6,6,6,6,6,6,6,6,9,9,9,9,9,9,9};
		
		int sum=0,flag=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==6){
				flag=1;
			}
			if(arr[i]==9 && flag==1){
				flag=0;
				continue;
			}
			if(flag==0){
				sum=sum+arr[i];
				System.out.println("adding: "+arr[i]);
			}
		}
		
		System.out.println(sum);

	}

}
