class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        int fac[] = {2,3,5};
        for(int i = 0; i < fac.length; i++){
            while(n % fac[i] == 0){
                n /= fac[i];
            }
        }
        return n == 1;
    }
}