// Last updated: 5/11/2026, 9:53:25 AM
class Solution {
    public int mirrorDistance(int n) {
        int x = Math.abs(n), r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        return Math.abs(n - r);
    }
}
