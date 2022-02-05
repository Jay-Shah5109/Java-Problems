public class Subarray_with_given_sum {
    public static boolean subarray_with_given_sum(int arr[], int expectedSum){
        int currentSum = 0, index = 0, flag=0;
        for (int i = 0; i<=arr.length; i++){
            while (currentSum > expectedSum && index < i-1 ){
                currentSum-=arr[index];
                index++;
            }
            if (currentSum == expectedSum){
                flag = 1;
                break;
            }
            currentSum+=arr[i];
        }
        if (flag==1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        int arr[] = {1, 4, 20, 3, 10, 5};
        System.out.println(subarray_with_given_sum(arr, 24));
    }
}
