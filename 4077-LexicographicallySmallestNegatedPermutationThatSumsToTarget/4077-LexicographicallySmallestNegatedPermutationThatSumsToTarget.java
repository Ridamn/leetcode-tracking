// Last updated: 5/11/2026, 9:53:58 AM
class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long sum_all = (long)n * (n + 1) / 2;
        if (target < -sum_all || target > sum_all) return new int[0];
        if ( (target & 1L) != (sum_all & 1L) ) return new int[0];

        long t = target;

        int[] sign = new int[n + 1];
        long need = t;
        long left = sum_all;

        for (int k = n; k >= 1; k--) {
            long try_neg = need + k;
            long left_after = left - k;

            if (Math.abs(try_neg) <= left_after && ((try_neg & 1L) == (left_after & 1L))) {
                sign[k] = -1;
                need = try_neg;
            } else {
                sign[k] = 1;
                need = need - k;
            }
            left = left_after;
        }

        int[] out = new int[n];
        int pos = 0;

        for (int k = n; k >= 1; k--) if (sign[k] == -1) out[pos++] = -k;
        for (int k = 1; k <= n; k++) if (sign[k] == 1) out[pos++] = k;

        return out;
    }
}
