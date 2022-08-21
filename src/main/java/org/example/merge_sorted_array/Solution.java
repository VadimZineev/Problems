package org.example.merge_sorted_array;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++, n--) {
            nums1[i] = nums2[n - 1];
        }
        Arrays.sort(nums1);
    }
}