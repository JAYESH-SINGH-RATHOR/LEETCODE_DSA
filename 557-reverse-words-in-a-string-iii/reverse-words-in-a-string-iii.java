class Solution {
    public String reverseWords(String s) {
      String words[] = s.split(" ");
      StringBuilder res = new StringBuilder();
      for(int i = 0; i < words.length; i++){
        char ch[] = words[i].toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
            res.append(new String(ch));
            if(i != words.length - 1){
                res.append(" ");
            }
      }
      return res.toString();
    
    }
}