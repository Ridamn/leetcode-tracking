// Last updated: 5/11/2026, 9:53:47 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        if (nums.length < 3) return 0;

        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        int c1 = Integer.MAX_VALUE;
        int c2 = Integer.MAX_VALUE;

        for (int x : nums) {
            if (x > a) {
                b = a;
                a = x;
            } else if (x > b) {
                b = x;
            }

            if (x < c1) {
                c2 = c1;
                c1 = x;
            } else if (x < c2) {
                c2 = x;
            }
        }

        return a + b - c1;
    }
}
