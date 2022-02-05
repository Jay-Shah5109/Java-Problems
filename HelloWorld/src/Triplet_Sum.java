public class Triplet_Sum {

    public static boolean checkIfExistsInArray(int arr[], int sum){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==sum){
                return true;
            }
        }
        return false;
    }
    public static int countTriplets(int arr[], int size){
        int count=0;
        for(int i=0;i<size-1;i++){
            for (int j=1;j<size;j++){
                if (checkIfExistsInArray(arr,(arr[i]+arr[j]))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[] = {1, 5, 3, 2}; // sorted array: 1 2 3 5
        System.out.println(countTriplets(arr, arr.length));
    }
}

// New Task for this PS: Use a sorting algo here, and check using one for loop and one while loop for the
// given problem statement