// Last updated: 5/11/2026, 9:53:56 AM
class Solution {
    public int largestPrime(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) isPrime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (!isPrime[p]) continue;
            for (int q = p * p; q <= n; q += p) isPrime[q] = false;
        }
        int sum = 0;
        int ans = 0;
        for (int x = 2; x <= n; x++) {
            if (!isPrime[x]) continue;
            sum += x;
            if (sum > n) break;
            if (isPrime[sum]) ans = sum;
        }
        return ans;
    }
}
