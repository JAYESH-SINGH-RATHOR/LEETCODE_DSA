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
        if(head == null || head.next == null || k == 0){
            return head;
        }
        int size = 1;
        ListNode curr = head;
         while(curr.next != null){ 
            size++;
            curr = curr.next;
        }
        k = k % size;
        if(k == 0){
            return head;
        }
          curr.next = head; 
        ListNode temp = head;
        int target = size - k - 1;
        for(int i = 0; i < target; i++){ 
            temp = temp.next;
        }
       ListNode newHead = temp.next; 
        temp.next = null; 
        
        return newHead;
    }
}