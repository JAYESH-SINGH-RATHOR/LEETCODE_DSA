class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String arr[] = path.split("/");
        for(int i = 0; i < arr.length; i++){
            String curr = arr[i];
            if(curr.equals("." )|| curr.equals("")){
                continue;
            }
            else if(curr.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
                else{
                    st.push(curr);
                }
            }
            StringBuilder res = new StringBuilder();
            for(String ele : st){
                res.append("/");
                res.append(ele);
            }
            if(res.length() == 0){
                return "/";
            }
        return res.toString();
    }
}