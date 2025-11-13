class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int even = 0;
        int odd =0;
        for(int i = 0; i < n; i++){
            int val = num.charAt(i) - '0';
            if(i % 2 == 0){
                even += val;
            }
            else{
                odd += val;
            }
        }
        // if(even == odd){
        //     return true;
        // }
        return even == odd;
    }
}