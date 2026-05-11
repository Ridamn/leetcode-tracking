// Last updated: 5/11/2026, 9:53:51 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int[] l = new int[n];
        int[] r = new int[n];

        l[0] = 1;
        for (int i = 1; i < n; i++) {
            l[i] = nums[i] >= nums[i - 1] ? l[i - 1] + 1 : 1;
        }

        r[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            r[i] = nums[i] <= nums[i + 1] ? r[i + 1] + 1 : 1;
        }

        int max = 1;
        for (int i = 0; i < n; i++) {
            int left = i > 0 ? l[i - 1] : 0;
            int right = i < n - 1 ? r[i + 1] : 0;

            if (i > 0 && i < n - 1 && nums[i + 1] >= nums[i - 1]) {
                max = Math.max(max, left + 1 + right);
            } else {
                max = Math.max(max, Math.max(left, right) + 1);
            }
        }

        return max;
    }
}
