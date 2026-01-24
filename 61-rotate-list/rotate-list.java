/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode curr = head;
        int n = 1;
        while (curr.next != null) {
            curr = curr.next;
            n++;
        }
        curr.next = head;
        k = k % n;
         int jump = n - k;
         while (jump > 0) {
            curr = curr.next;
            jump--;
        }
        ListNode returnhead = curr.next;
        curr.next = null;
        return returnhead;
    }
}
