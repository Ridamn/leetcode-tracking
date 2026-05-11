// Last updated: 5/11/2026, 9:54:10 AM
class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n + 1];
        len[0] = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                len[i + 1] = len[i] + 1;
            } else if (ch == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            } else if (ch == '#') {
                len[i + 1] = Math.min(1_000_000_000_000_000L, len[i] * 2);
            } else if (ch == '%') {
                len[i + 1] = len[i];
            }
        }

        if (k >= len[n]) return '.';

        return getKthChar(s, len, n, k);
    }

    private char getKthChar(String s, long[] len, int i, long k) {
        while (i > 0) {
            char ch = s.charAt(i - 1);
            if (Character.isLowerCase(ch)) {
                if (len[i] - 1 == k) return ch;
                i--;
            } else if (ch == '*') {
                len[i - 1] = len[i] + 1;
                i--;
            } else if (ch == '#') {
                if (k < len[i] / 2) {
                    len[i - 1] = len[i] / 2;
                    i--;
                } else {
                    k -= len[i] / 2;
                    len[i - 1] = len[i] / 2;
                    i--;
                }
            } else if (ch == '%') {
                k = len[i] - 1 - k;
                i--;
            }
        }

        return '.';
    }
}
