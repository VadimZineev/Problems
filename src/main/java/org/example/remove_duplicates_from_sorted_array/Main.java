package org.example.remove_duplicates_from_sorted_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] x = new int[]{1, 1, 2};
        int[] y = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("First  = " + solution.removeDuplicates(x));
        System.out.println("Second = " + solution.removeDuplicates(y));


        Arrays.stream(x).forEach(System.out::print);
        System.out.println("\n\n");
        Arrays.stream(y).forEach(System.out::print);
    }
}
