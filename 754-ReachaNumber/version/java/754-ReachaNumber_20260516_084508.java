// Last updated: 5/16/2026, 8:45:08 AM
1class Solution {
2    public int reachNumber(int target) {
3        target = Math.abs(target);
4
5        int c = 0;
6        while(target > 0){
7            target -= ++c;
8        }
9        if(target%2==0) return c;
10        return c + 1 + (c%2);
11    }
12}