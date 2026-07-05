class Solution {

            // method 1
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;

    //     }
    //     char[] sArr = s.toCharArray();
    //     char[] tArr = t.toCharArray();
    //     Arrays.sort(sArr);
    //     Arrays.sort(tArr);

    //     return Arrays.equals(sArr, tArr);
    // }

    // method 2

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>(); 
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 0);
            }
            int freq = map.get(ch);
            map.put(ch , freq + 1);
        }    
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
          
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            map.put(ch , map.get(ch) - 1);
        }
        return true;
    }
}
