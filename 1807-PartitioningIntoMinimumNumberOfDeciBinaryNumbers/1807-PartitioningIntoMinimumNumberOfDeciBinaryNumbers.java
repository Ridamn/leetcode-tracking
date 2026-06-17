// Last updated: 6/17/2026, 8:43:47 AM
class Solution {
    public int minPartitions(String n) {
        int max = 0;

        for (char c : n.toCharArray()) {
            max = Math.max(max, c - '0');
        }

        return max;
    }
}