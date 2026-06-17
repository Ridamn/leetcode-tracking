// Last updated: 6/17/2026, 8:45:02 AM
class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);

        int c = 0;
        while(target > 0){
            target -= ++c;
        }
        if(target%2==0) return c;
        return c + 1 + (c%2);
    }
}