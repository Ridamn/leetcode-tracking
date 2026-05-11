// Last updated: 5/11/2026, 9:53:23 AM
class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arr[i] = Math.min(nums[i], arr[i + 1]);
        }

        long c = 0;
        long ans = Long.MIN_VALUE;

        for (int i = 0; i < n - 1; i++) {
            c += nums[i];
            ans = Math.max(ans, c - arr[i + 1]);
        }

        return ans;
    }
}
