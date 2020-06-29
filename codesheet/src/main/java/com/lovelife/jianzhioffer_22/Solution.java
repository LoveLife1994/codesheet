package com.lovelife.jianzhioffer_22;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode p1 = null;
        ListNode p2 = head;
        int dis = 1;
        while (p2.next != null) {
            if (k == 1 && p1 == null) {
                p1 = head;
                continue;
            }
            if (dis < k) {
                dis++;
            }
            if (dis == k && p1 == null) {
                p1 = head;
            } else if(p1 != null) {
                p1 = p1.next;
            }
            p2 = p2.next;
        }
        return p1 == null ? head : p1;
    }
}