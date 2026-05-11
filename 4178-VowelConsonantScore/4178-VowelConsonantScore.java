// Last updated: 5/11/2026, 9:53:18 AM
class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    v++;
                else
                    c++;
            }
        }
        return c == 0 ? 0 : v / c;
    }
}