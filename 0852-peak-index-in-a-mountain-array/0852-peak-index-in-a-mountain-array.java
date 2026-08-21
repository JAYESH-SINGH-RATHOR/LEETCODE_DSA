class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int left = 0;
       int right = arr.length - 1;
       int max = Integer.MIN_VALUE;
       while(left <= right){
        int mid  = left + (right - left) / 2;
        if(arr[mid] == max){
            return mid;
        }else if(arr[mid] > max){
            max = mid;
            right = mid - 1;
        }else{
            left = mid + 1;
        }
       }
       return max;
    }
}