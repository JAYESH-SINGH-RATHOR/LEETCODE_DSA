class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int n = columnTitle.length();
        for(int i = 0; i < n; i++){
            char val = columnTitle.charAt(i);
            int integervalue =  val - 'A'  + 1 ;
            res = res * 26 + integervalue;
       }
       return res;
    }
}


