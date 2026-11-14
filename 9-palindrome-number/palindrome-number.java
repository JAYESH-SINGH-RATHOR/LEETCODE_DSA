class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int palindrome = 0;
        while(x > 0){
        int divisor = x % 10;
        palindrome = palindrome * 10 + divisor;
        x /= 10;
        }
        return (original == palindrome);
    }
}