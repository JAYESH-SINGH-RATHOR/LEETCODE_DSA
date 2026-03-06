class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // brute force appraoch

        // int n = temperatures.length;
        // int ans[] = new int[n];
        // for(int i = 0; i < n; i++){
        //     int curr = temperatures[i];
        //     for(int j = i + 1; j < n; j++){
        //         if(temperatures[j] > curr){
        //             ans[i] = j - i;
        //             break;
        //         }
        //     }
        // }
        // return ans;

        // optimized approach
        Stack<Integer>st = new Stack<>();
        int n =  temperatures.length;
        int res[] = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                int pop = st.pop();
                res[pop] = i - pop;
            }
            st.push(i);
        }
        return res;
    }
}