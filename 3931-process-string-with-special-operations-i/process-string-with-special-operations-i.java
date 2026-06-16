class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                res.append(ch);
            }
            if(ch == '%'){
               res.reverse();
            }
           else if(ch == '*'){
                if(res.length() > 0){
                    res.deleteCharAt(res.length() - 1);
                }
            }
            else if(ch == '#'){
                res.append(res.toString());
            }
        }
        return res.toString();
    }
}