// Last updated: 7/16/2026, 8:38:19 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int n = nums.length;
4        int[] pre = new int[n+1];
5        pre[0] = 0;
6        int ans=Integer.MAX_VALUE;
7
8        for(int i=1; i<n+1; i++){
9            pre[i] = pre[i-1] + nums[i-1];
10            // System.out.print(pre[i]+" ");
11        }
12        for(int i=0; i<n+1; i++){
13            int start = i+1;
14            int end = n;
15            int need = target+pre[i];
16            while(start<=end){
17                int mid = (start+end)/2;
18                if(pre[mid] >= need){
19                    ans = Math.min(ans, mid-i);
20                    end = mid-1;
21                }
22                else start = mid+1;
23            }
24        }
25
26        return ans == Integer.MAX_VALUE ? 0 : ans;
27    }
28}