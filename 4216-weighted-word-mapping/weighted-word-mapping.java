class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        int m = weights.length;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                sum += weights[ch - 'a'];
            }
             int mod = sum % 26;
             char mappedchar = (char)('z' - mod);
             sb.append(mappedchar);
        }   
            return sb.toString();
    }
}