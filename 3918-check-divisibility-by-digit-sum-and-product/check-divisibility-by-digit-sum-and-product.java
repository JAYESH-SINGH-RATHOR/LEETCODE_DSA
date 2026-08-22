class Solution {
    public boolean checkDivisibility(int n) {     
        String s = Integer.toString(n);
        if(s.length() == 1){
            return false;
        }
        int sum = 0;
        int mul = 1;
        for(int i = 0; i < s.length(); i++){
            sum +=  s.charAt(i) - '0';
            mul *=  s.charAt(i) - '0';
        }
         return n % (sum + mul) == 0;
    }
}

