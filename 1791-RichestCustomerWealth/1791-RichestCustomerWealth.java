// Last updated: 5/11/2026, 9:56:13 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] i : accounts){
            int n = 0;
            for(int j : i){
                n += j;
            }
            max = Math.max(max, n);
        }
        return max;
    }
}