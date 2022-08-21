package org.example.remove_duplicates_from_sorted_array;


import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}