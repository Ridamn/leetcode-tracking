// Last updated: 5/11/2026, 9:53:34 AM
import java.util.*;

class Solution {
    public long totalScore(int hp, int[] damage, int[] requirement) {
        int n = damage.length;
        long[] pre = new long[n+1];
        for (int i = 1; i <= n; i++) pre[i] = pre[i-1] + damage[i-1];

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            long need = pre[i] - (hp - requirement[i-1]);
            int j = lowerBound(pre, need);
            if (j <= i) ans += (i - j + 1);
        }
        return ans;
    }

    private int lowerBound(long[] a, long x) {
        int l = 0, r = a.length - 1, p = a.length;
        while (l <= r) {
            int m = (l + r) >> 1;
            if (a[m] >= x) { p = m; r = m - 1; }
            else l = m + 1;
        }
        return p + 1;
    }
}
