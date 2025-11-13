class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        int res = 0;
        int one = 0;
        for(int i = 0; i < n; i++){
            char val = s.charAt(i);
            if(val == '1'){
                one++;
            }
            else{
               if (i > 0 && s.charAt(i - 1) == '1') {
                    res += one;
                }
            }
        }
        return res;
    }
}