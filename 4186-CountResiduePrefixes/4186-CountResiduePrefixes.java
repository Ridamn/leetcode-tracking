// Last updated: 5/11/2026, 9:53:12 AM
class Solution {
    public int residuePrefixes(String s) {
        boolean[] seen = new boolean[26];
        int d = 0, ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (!seen[c]) {
                seen[c] = true;
                d++;
            }
            if (d == (i + 1) % 3) ans++;
        }
        return ans;
    }
}
