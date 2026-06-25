class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char e = s.charAt(i);
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        PriorityQueue<Character> pq =
            new PriorityQueue<>(
                (a, b) -> map.get(b) - map.get(a)
            );

        for (char e : map.keySet()) {
            pq.add(e);
        }

        StringBuilder res = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.remove();
            int freq = map.get(c);

            while (freq-- > 0) {
                res.append(c);
            }
        }

        return res.toString();
    }
}