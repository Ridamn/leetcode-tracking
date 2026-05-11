// Last updated: 5/11/2026, 9:54:22 AM
class Solution {
    public int specialTriplets(int[] nums) {
        final int mod = 1_000_000_007;
        long cnt = 0;

        Map<Integer , Integer> total = new HashMap<>();
        for (int num : nums) {
            total.put(num , total.getOrDefault(num , 0) + 1);
        }

        Map<Integer , Integer> leftCnt = new HashMap<>();
        for (int num : nums) {
            total.put(num , total.get(num) - 1);

            int left = leftCnt.getOrDefault(2 * num , 0);
            int right = total.getOrDefault(2 * num , 0);

            cnt += (long) left * right;

            leftCnt.put(num , leftCnt.getOrDefault(num , 0) + 1);
        }
        return (int) (cnt % mod);
    }
}