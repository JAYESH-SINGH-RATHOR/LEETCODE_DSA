// appraoch 1 O(N)

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = -1;
//         int sec = -1;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == target){
//                 first = i;
//                 break;
//             }
//         }
//         for(int i = nums.length - 1; i >= 0; i--){
//             if(nums[i] == target){
//                 sec = i;
//                 break;
//             }
//         }
//         return new int[]{first , sec};
//     }
// }


// appraoch O(lon n)

class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first = findFirst(nums , target);
      int  last = findLast(nums , target);
      return new int[] {first , last};
    }
    int findFirst(int arr[] , int t){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == t){
                ans = mid;
                right = mid - 1;
            }else if(arr[mid] < t){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    int findLast(int arr[] , int t){
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == t){
                ans = mid;
                left = mid + 1;
            }else if(arr[mid] < t){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
}
