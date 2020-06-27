package com.lovelife._19;



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        if (head == null) {
            return head;
        }

        ListNode p2 = null;
        int count = 1;
        while (p1.next != null) {
            p1 = p1.next;
            if (count >= n) {
                if (p2 == null) {
                    p2 = head;
                } else {
                    p2 = p2.next;
                }
            }
            count++;
        }
        if (p2 == null) {
            return head.next;
        }
        p2.next = p2.next.next;
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
