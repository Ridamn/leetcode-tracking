// Last updated: 5/11/2026, 9:53:10 AM
class Solution {
    public int minimumIndex(int[] cap, int item) {
        int min = 101;
        int ans = -1;
        for(int i = 0; i<cap.length; i++){
            int n = cap[i];
            if(n >= item && min > n){
                min = n;
                ans = i;
            }
        }
        return ans;
    }
}