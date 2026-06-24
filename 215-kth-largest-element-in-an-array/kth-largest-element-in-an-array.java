public class Solution {
    public static int findKthLargest(int[] nums, int k) {
     int n = nums.length;
     PriorityQueue<Integer> pq = new PriorityQueue<>();
     for(int e : nums){
        pq.add(e);
        if(pq.size() > k){
            pq.remove();
        }
     }
     return pq.peek();
    }
}
