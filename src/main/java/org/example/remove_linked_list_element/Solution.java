package org.example.remove_linked_list_element;

import org.example.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur != null){
            while(cur != null && cur.val == val){
                cur = cur.next;
            }
            pre.next = cur;
            if(cur == null) return dummy.next;
            pre = pre.next;
            cur = cur.next;
        }
        return dummy.next;
    }
}
