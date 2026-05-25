// Last updated: 5/25/2026, 8:45:25 AM
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        int ans=0;
4        Arrays.sort(nums);
5        // Map(Integer, Integer) mp = new HashMap<>();
6        int p1=0;
7        int p2=nums.length-1;
8        while(p1<p2){
9            if(nums[p1] + nums[p2] == k){
10                ans++;
11                p1++;
12                p2--;
13            }
14            else if(nums[p1] + nums[p2] > k) p2--;
15            else p1++;
16        }
17        return ans;
18    }
19}