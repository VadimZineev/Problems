package org.example.remove_duplicates_from_sorted_list;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //solution.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2))));
        solution.deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
    }
}
