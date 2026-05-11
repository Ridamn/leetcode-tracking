// Last updated: 5/11/2026, 9:53:42 AM
class Solution {
    public int centeredSubarrays(int[] nums) {

        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                sum += nums[j];
                set.add(nums[j]);

                if (set.contains(sum)) ans++;
            }
        }
        return ans;
    }
}
