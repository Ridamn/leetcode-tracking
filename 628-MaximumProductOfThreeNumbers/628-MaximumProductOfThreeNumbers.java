// Last updated: 5/11/2026, 9:57:26 AM
class Solution {
    public int maximumProduct(int[] nums) {
        long a = Long.MIN_VALUE, b = Long.MIN_VALUE, c = Long.MIN_VALUE;
        long x = Long.MAX_VALUE, y = Long.MAX_VALUE;
        for (int v : nums) {
            long n = v;
            if (n > a) {
                c = b; b = a; a = n;
            } else if (n > b) {
                c = b; b = n;
            } else if (n > c) {
                c = n;
            }
            if (n < x) {
                y = x; x = n;
            } else if (n < y) {
                y = n;
            }
        }
        long r1 = a * b * c;
        long r2 = a * x * y;
        return (int) Math.max(r1, r2);
    }
}
