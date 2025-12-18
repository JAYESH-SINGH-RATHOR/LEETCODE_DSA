class Solution {
    public boolean checkIfExist(int[] arr) {
        // int n = arr.length;
        // if(n == 0){
        //     return false;
        // }
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         if(i != j && arr[i] == 2 * arr[j]){
        //             return true;
        //         }       
        //     }
        // }
        // return false;


    Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            if (binarySearch(arr, target, i)) {
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(int[] arr, int target, int index) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target && mid != index) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}