package org.example.plus_one;


import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int newLength = digits[0] == 9 ? digits.length + 1 : digits.length;
        int[] answer = new int[newLength];
        int a = newLength - 1;
        answer[a] = 1;
        for (int d = digits.length - 1; d >= 0; --d, --a) {
            answer[a] += digits[d];
            if (answer[a] == 10) {
                answer[a] = 0;
                answer[a - 1] = 1;
            }
        }
        return answer[0] > 0 ? answer : Arrays.copyOfRange(answer, 1, newLength);
    }
}