class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int lower[] = new int[26];
        int upper[] = new int[26];

        for(int i = 0; i < n; i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                lower[ch - 'a']++;
            }else if(ch >= 'A' && ch <= 'Z'){
                upper[ch - 'A']++;
            }
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(lower[i] > 0 && upper[i] > 0){
                count++;
            }
        }
        return count;
    }
}