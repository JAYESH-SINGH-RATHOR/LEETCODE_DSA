class Solution {
    public String removeStars(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        for(char c : st){
            res.append(c);
        }
        return res.toString();
    }
}