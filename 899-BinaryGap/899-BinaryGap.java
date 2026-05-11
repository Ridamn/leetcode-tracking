// Last updated: 5/11/2026, 9:57:04 AM
class Solution {
    public int binaryGap(int n) {
        int dist = 0;
        int last = -1;
        for(int i=0;i<31;i++){
            if((n & 1) == 1){
                if(last != - 1) 
                    dist = Math.max(dist, i - last);
                last = i;
            }
            n = n >> 1;
        }
        return dist;
    }
}