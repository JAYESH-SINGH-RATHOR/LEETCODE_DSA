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
    public ListNode swapNodes(ListNode head, int k) {
      ListNode curr = head;
      int size = 0;
      while(curr != null){
        size++;
        curr = curr.next;
      }  
      int lastvalue = size - k;
      ListNode node1 = head;
        ListNode node2 = head;
        int counter =0;
        while(counter < k - 1){
            counter++;
            node1 = node1.next;
        }
        counter = 0;
        while(counter < lastvalue){
            counter++;
            node2 = node2.next;
        }
        // swapping the values 
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
        return head;
    }
}