// Last updated: 6/5/2026, 9:11:38 AM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int d) {
3        int ans=0;
4
5        for(int i : nums){
6            while(i != 0){
7                int n = i%10;
8                // System.out.println("n : " + n);
9                if(n==d) ans++;
10                // System.out.println("ans : "+ ans);
11                i /= 10;
12                // System.out.println("i : "+ i);
13            }
14        }
15        return ans;
16    }
17}