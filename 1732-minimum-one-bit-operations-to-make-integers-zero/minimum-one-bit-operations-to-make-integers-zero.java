class Solution {
    public int minimumOneBitOperations(int n) {
        if(n == 0){
            return 0;
        }
         int result = 0;
          while (n > 0) {
            result ^= n;
              n >>= 1;
               }
        return result;
    }
}