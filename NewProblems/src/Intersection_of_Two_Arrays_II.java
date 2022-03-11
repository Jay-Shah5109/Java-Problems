import java.util.*;

public class Intersection_of_Two_Arrays_II {

    public static int[] calculate(int nums1[], int nums2[]) {
        int value, count=0;
        List<Integer> newlist = new ArrayList<>();
        Map<Integer, Integer> hmap = new HashMap<>();
        // Add the element in hashmap with its frequency
        for (int i = 0 ; i < nums1.length ; i++) {
            if ( hmap.containsKey(nums1[i]) ) {
                value = (Integer) hmap.get(nums1[i]);
                hmap.put(nums1[i], ++value);
            }
            else
                hmap.put(nums1[i], 1);
        }
        // Iterate over second array and check in hashmap that if the key exists and value is not zero,
        // then add it to new array that has to be returned as the answer
        for (int i = 0 ; i < nums2.length ; i++) {
            if ( hmap.containsKey(nums2[i]) && ( hmap.get(nums2[i]) != 0 ) ) {
                value = (Integer) hmap.get(nums2[i]);
                newlist.add(nums2[i]);
                hmap.put(nums2[i], --value);
            }
        }
        int[] finalArr = new int[newlist.size()];
        // Add elements from list to array and return it as the answer
        Iterator itr = newlist.iterator();
        while (itr.hasNext()) {
            finalArr[count] = (Integer) itr.next();
            count++;
        }
        return finalArr;
    }

    public static void main(String[] args) {

        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int finalResult[] = calculate(nums1, nums2);
        for (Integer i : finalResult) {
            System.out.println(i);
        }

    }

}
