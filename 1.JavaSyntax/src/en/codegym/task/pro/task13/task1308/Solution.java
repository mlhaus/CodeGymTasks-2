package en.codegym.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Studying the methods of the Collections class. Part 3
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(8,9,2,1,7,7,6,7));
        System.out.println(min(nums));
        System.out.println(max(nums));
        System.out.println(frequency(nums, 7));
        Collections.sort(nums);
        System.out.println(binarySearch(nums, 6));
    }

    public static int min(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    public static int max(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        return Collections.frequency(list, element);
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        return Collections.binarySearch(list, key);
    }
}
