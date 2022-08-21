package org.example.plus_one;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] test1 = solution.plusOne(new int[]{1, 2, 3});
        int[] test2 = solution.plusOne(new int[]{4, 3, 2, 1});
        int[] test3 = solution.plusOne(new int[]{9});
        int[] test4 = solution.plusOne(new int[]{9, 9});
        int[] test5 = solution.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        int[] test6 = solution.plusOne(new int[]{9, 9, 9});

        System.out.println("test1");
        Arrays.stream(test1).forEach(System.out::println);
        System.out.println("test2");
        Arrays.stream(test2).forEach(System.out::println);
        System.out.println("test3");
        Arrays.stream(test3).forEach(System.out::println);
        System.out.println("test4");
        Arrays.stream(test4).forEach(System.out::println);
        System.out.println("test5");
        Arrays.stream(test5).forEach(System.out::println);
        System.out.println("test6");
        Arrays.stream(test6).forEach(System.out::println);
    }
}