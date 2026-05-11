// Last updated: 5/11/2026, 9:53:31 AM
class Solution {
    public int[] sortByReflection(int[] nums) {
        int n = nums.length;
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) a[i] = nums[i];

        Arrays.sort(a, (x, y) -> {
            int rx = revBin(x);
            int ry = revBin(y);
            if (rx != ry) return rx - ry;
            return x - y;
        });

        for (int i = 0; i < n; i++) nums[i] = a[i];
        return nums;
    }

    private int revBin(int x) {
        String s = Integer.toBinaryString(x);
        String r = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(r, 2);
    }
}