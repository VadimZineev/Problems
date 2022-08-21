package org.example.merge_sorted_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] test1 = {1, 2, 3, 0, 0, 0};
        solution.merge(test1, 3, new int[]{2, 5, 6},3);
        Arrays.stream(test1).forEach(System.out::println);

        int[] test2 = {1};
        solution.merge(test2, 1, new int[]{},0);
        Arrays.stream(test2).forEach(System.out::println);

        int[] test3 = {0};
        solution.merge(test3, 0, new int[]{1},1);
        Arrays.stream(test3).forEach(System.out::println);
    }
}
