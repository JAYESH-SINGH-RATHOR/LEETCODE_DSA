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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp != null ){
            temp = temp.next;
            size++;
        }
        int target = size - n;
        ListNode dummynode = new ListNode(0);
        dummynode.next = head;
        temp = dummynode;
        for(int i = 0; i < target; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummynode.next;
    }
}