import java.util.*;

public class SortedArray {


    public static int[] sort_arrays_union( int nums1[], int nums2[] ) {
        Set<Integer> hashsetA = new HashSet<>();
        Set<Integer> hashsetB = new HashSet<>();
        Map<Integer, Integer> hashmapA = new HashMap<>();
        //Map<Integer, Integer> hashmapB = new HashMap<>();
        // Remove duplicates by adding to set
        for (int i = 0 ; i < nums1.length ; i++) {
            hashsetA.add(nums1[i]);
        }
        for (int i = 0 ; i < nums2.length ; i++) {
            hashsetB.add(nums2[i]);
        }
        Iterator itrA = hashsetA.iterator();
        Iterator itrB = hashsetB.iterator();
        // Transfer from set to map with value as count
        while (itrA.hasNext()) {
            hashmapA.put((Integer) itrA.next(), 1);
        }
        int count = 0, valueA, start=0;
        while (itrB.hasNext()) {
            int key = (Integer) itrB.next();
            if (hashmapA.containsKey(key)) {
                valueA = hashmapA.get(key);
                hashmapA.put(key, ++valueA);
            }
        }
        for (Map.Entry mapentry : hashmapA.entrySet()) {
            if((Integer)mapentry.getValue() > 1) {
                count++;
            }
        }
        int newarr[] = new int[count];
        for (Map.Entry mapentry : hashmapA.entrySet()) {
            if((Integer)mapentry.getValue() > 1) {
                count++;
                newarr[start] = (Integer) mapentry.getKey();
                start++;
            }
        }
        return newarr;
    }

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int finalResult[] = sort_arrays_union(nums1, nums2);

        for (Integer i : finalResult) {
            System.out.println(i);
        }

    }


}
