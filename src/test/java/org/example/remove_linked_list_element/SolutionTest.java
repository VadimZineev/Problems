package org.example.remove_linked_list_element;

import org.example.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void removeElements() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        ListNode eq = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        solution.removeElements(head, 6);
        assertEquals(head, eq);
    }
}