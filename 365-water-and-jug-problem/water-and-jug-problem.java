class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        // if(x == target || y == target){
        //     return false;
        // }
        if(x + y < target){
            return false;
        }
        if(target == 0){
            return true;
        }
        return target % gcd(x , y) == 0;
    }
    int gcd(int x , int y){
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}