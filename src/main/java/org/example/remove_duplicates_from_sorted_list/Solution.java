package org.example.remove_duplicates_from_sorted_list;

public class Solution {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        // O(n)
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
