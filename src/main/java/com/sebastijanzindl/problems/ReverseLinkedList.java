package com.sebastijanzindl.problems;

import com.sebastijanzindl.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode temp = head;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
