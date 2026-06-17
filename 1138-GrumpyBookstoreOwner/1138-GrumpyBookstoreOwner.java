// Last updated: 6/17/2026, 8:44:34 AM
class Solution {
    public int maxSatisfied(int[] cus, int[] g, int m) {
        int ans = 0;
        int c = 0;
        int j = 0;
        int max = 0;

        for(int i = 0; i < cus.length; i++){
            if(g[i] == 0){
                ans += cus[i];
            }
        }

        for(int i = 0; i < cus.length; i++){
            if(g[i] == 1){
                c += cus[i];
            }

            if(i - j + 1 > m){
                if(g[j] == 1){
                    c -= cus[j];
                }
                j++;
            }

            max = Math.max(c, max);
        }

        return ans + max;
    }
}