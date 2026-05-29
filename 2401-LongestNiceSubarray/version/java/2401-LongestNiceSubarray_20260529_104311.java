// Last updated: 5/29/2026, 10:43:11 AM
1class Solution {
2    public int longestNiceSubarray(int[] nums) {
3        int j=0;
4        int max=0;
5        int sum = 0;
6
7        for(int i=0; i<nums.length; i++){
8            // sum += nums[i];
9            while((sum & nums[i]) != 0){
10                sum ^= nums[j];
11                j++;
12            }
13            sum |= nums[i];
14            max = Math.max(max, i-j+1);
15        }
16        return max;
17    }
18}