package org.example.climbing_stairs;

public class Solution {
    public int climbStairs(int n) {
        int x = 1;
        if (n % 3 == 0) {
            x += n / 3;
            ++x;
        }
        if (n % 2 == 0) {
            x += n / 2;
            ++x;
        }
        return x;
    }
}
