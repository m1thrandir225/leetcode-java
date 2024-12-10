package com.sebastijanzindl.problems;


import com.sebastijanzindl.ListNode;

public class RemoveNthNodeFromSLL {
    public static ListNode removeNthLastNode(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while(first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return dummy.next;

    }

}
