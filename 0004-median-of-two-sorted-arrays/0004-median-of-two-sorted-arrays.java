class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = 0;
        int right = 0;
        int idx = 0;
        int mergearr[] = new int[n + m];
        while(left < n && right < m){
            if(nums1[left] <= nums2[right]){
                mergearr[idx++] = nums1[left++];
            }else{
                mergearr[idx++] = nums2[right++];
            }
        }
        while(left < n){
            mergearr[idx++] = nums1[left++];
        }
        while(right < m){
            mergearr[idx++] = nums2[right++];
        }
        for(int e : mergearr){
            System.out.print(e + " ");
        }
        int total_length = mergearr.length;

        if(total_length % 2 == 1){
            return mergearr[total_length / 2];
        }else{
            return (mergearr[total_length / 2] + mergearr[total_length / 2 - 1]) / 2.0;
        }
    }
}