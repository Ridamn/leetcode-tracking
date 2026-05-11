// Last updated: 5/11/2026, 9:53:26 AM
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int[] f = new int[100001];
        int dup = 0;
        int ans = (n + 2) / 3;

        for (int i = n - 1; i >= 0; i--) {
            int v = nums[i];
            f[v]++;
            if (f[v] == 2) dup++;

            if (dup == 0 && i % 3 == 0) {
                ans = i / 3;
            }
        }
        return ans;
    }
}
