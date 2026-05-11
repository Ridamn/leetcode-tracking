// Last updated: 5/11/2026, 9:53:33 AM
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long s = (long) need1 * cost1 + (long) need2 * cost2;

        int k = Math.min(need1, need2);
        long c = (long) k * costBoth + (long) (need1 - k) * cost1 + (long) (need2 - k) * cost2;

        long total = (long) Math.max(need1, need2) * costBoth;

        return Math.min(s, Math.min(c, total));
    }
}
