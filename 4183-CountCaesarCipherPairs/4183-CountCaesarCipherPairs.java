// Last updated: 5/11/2026, 9:53:15 AM
class Solution {
    public long countPairs(String[] words) {

        HashMap<String, Integer> mp = new HashMap<>();

        for (String w : words) {
            int shift = w.charAt(0) - 'a';
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < w.length(); i++) {
                int c = w.charAt(i) - 'a';
                int nc = (c - shift + 26) % 26;
                sb.append((char) ('a' + nc));
            }

            String key = sb.toString();
            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }

        long ans = 0;
        for (int v : mp.values()) {
            ans += (long) v * (v - 1) / 2;
        }
        return ans;
    }
}
