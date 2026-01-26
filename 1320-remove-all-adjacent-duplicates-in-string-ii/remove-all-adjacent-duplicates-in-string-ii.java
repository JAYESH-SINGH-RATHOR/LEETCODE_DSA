class pair {
    char ch;
    int freq;

    public pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<pair> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek().ch == ch) {
                st.peek().freq++;

                if (st.peek().freq == k) {
                    st.pop();   // remove k duplicates
                }
            } else {
                st.push(new pair(1, ch));
            }
        }

        StringBuilder res = new StringBuilder();

        while (!st.isEmpty()) {
            int freq = st.peek().freq;
            char ch = st.peek().ch;
             st.pop();
            for (int i = 0; i < freq; i++) {
                res.append(ch);
            }
        }

        return res.reverse().toString();
    }
}
