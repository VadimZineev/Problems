package org.example.remove_element;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = solution.removeElement(new int[]{3,2,2,3}, 3);
        int y = solution.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println("X = " + x + "\nY = " + y);
    }
}