class Solution {
    public int numOfStrings(String[] patterns, String word) {
       int count = 0;
       for(String e : patterns){
        if(word.contains(e)){
            count++;
        }
       }
       return count;
    }
}