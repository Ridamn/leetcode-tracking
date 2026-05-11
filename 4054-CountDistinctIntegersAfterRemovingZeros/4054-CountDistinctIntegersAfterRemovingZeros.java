// Last updated: 5/11/2026, 9:54:02 AM
class Solution {
    public long countDistinct(long n) {
        String s = Long.toString(n);
        int m = s.length();

        long[] p = new long[m + 1];
        p[0] = 1;
        for (int i = 1; i <= m; i++) p[i] = p[i - 1] * 9;

        long ans = 0;

        for (int i = 1; i < m; i++) ans += p[i];

        boolean z = false;
        for (int i = 0; i < m; i++) {
            int d = s.charAt(i) - '0';
            int r = m - i - 1;
            if (d == 0) {
                z = true;
                break;
            }
            ans += (long) (d - 1) * p[r];
        }

        if (!z) ans++;

        return ans;
    }
}
