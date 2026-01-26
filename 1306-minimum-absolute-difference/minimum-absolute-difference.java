class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i< n; i++){
            min = Math.min(min , arr[i] - arr[i - 1]);
        }

        for(int j = 1; j < n; j++){
            if(arr[j] - arr[j - 1] == min){
                res.add(Arrays.asList(arr[j - 1] ,arr[j]));
            }
        }
        return res;
    }
}