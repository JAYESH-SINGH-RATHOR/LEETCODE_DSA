class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int n = s.length();
        int count = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o'){
                count++;
            }
        }
        max = Math.max(max , count);
        for(int i = k; i < n; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o'){
                count++;
            }
            char remove = s.charAt(i -  k);
             if(remove == 'a' || remove == 'e' || remove == 'i' || remove == 'o' || remove == 'u'){
                    count--;
                }
            max = Math.max(count , max );
        }
    return max;
    }
}