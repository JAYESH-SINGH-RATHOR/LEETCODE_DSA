// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()){
//             return false;
//         }
//         HashMap<Character , Integer > map = new HashMap<>();
//         for(int i = 0; i < s.length(); i++){
//             char ch = s.charAt(i);
//             if(!map.containsKey(ch)){
//                 map.put(ch , 0);
//             }
//             int freq = map.get(ch);
//             map.put(ch , freq + 1);
//         }
//         for(int i = 0; i < t.length(); i++){
//             char ch = t.charAt(i);
//             if(!map.containsKey(ch)){
//                 return false;
//             }
//             map.put(ch , map.get(ch) - 1);
//             if(map.get(ch) == 0){
//                 map.remove(ch);
//             }
//         }
//         return map.isEmpty();
//     }
// }


// secound appraoch // 

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int c : freq){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}