class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int arr1[] = new int[n];
        int right = -1;
        for(int i = n - 1; i >= 0; i--){
            arr1[i] = right;
            if(arr[i] > right){
                right = arr[i];
            }
        }
        return arr1;
    }
}