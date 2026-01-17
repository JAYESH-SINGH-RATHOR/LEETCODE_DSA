class Solution {
    public String longestPalindrome(String s) {
        if(s.length()  <= 1 || s == null){
            return s;
        }
        int n = s.length();
        String ans = "";
        for(int i = 0; i < n; i++){
            String odd = expand(s , i , i);
            String even = expand(s , i , i + 1);

            if(odd.length() > ans.length()){
                ans = odd;
            }
            if(even.length() > ans.length()) {
                ans = even;
            }
        }
        return ans;
    }
        public static String expand(String s , int left , int right ){
              while (left >= 0 && right < s.length()
            && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
         return s.substring(left + 1, right);
        }
}