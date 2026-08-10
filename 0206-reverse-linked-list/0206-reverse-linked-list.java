class Solution {
    public ListNode reverseList(ListNode head) {
       Stack<Integer> st = new Stack<>();
       ListNode temp = head;
       while(temp != null){
        st.push(temp.val);
        temp = temp.next;
       }
        System.out.print(st);
        temp = head;
        while(!st.isEmpty()){
            temp.val = st.pop();
            temp = temp.next;
        }
        return head;
    }
}
