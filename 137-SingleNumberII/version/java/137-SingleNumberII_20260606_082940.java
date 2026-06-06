// Last updated: 6/6/2026, 8:29:40 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans=0;
4        
5        for(int i=0; i<32; i++){
6            int c=0;
7
8            for(int j : nums){
9                c += (j >> i) & 1;
10            }
11
12            if(c % 3 != 0) ans |= (1 << i);
13        }
14        return ans;
15    }
16}