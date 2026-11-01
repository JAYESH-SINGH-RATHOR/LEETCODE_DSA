class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int n = s.length();
        int left = 0;
        int maxvowel = 0;
        for(int i = 0; i < k; i++){
             char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
         maxvowel = count;

       for(int i = k; i < n; i++){
            char leftChar = s.charAt(left);
            if (leftChar == 'a' || leftChar == 'e' ||
                leftChar == 'i' || leftChar == 'o' ||
                leftChar == 'u') {
                count--;
            }
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
            left++;
            maxvowel = Math.max(maxvowel , count);
       }
       return maxvowel;
    }
}