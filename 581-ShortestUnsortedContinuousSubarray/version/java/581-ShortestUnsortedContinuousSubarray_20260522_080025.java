// Last updated: 5/22/2026, 8:00:25 AM
1class Solution {
2    public int findUnsortedSubarray(int[] nums) {
3        int n=nums.length;
4        int mx = Integer.MIN_VALUE;
5        int mi = Integer.MAX_VALUE;
6        // int ans=0;
7        int p1=-1;
8        int p2=-1;
9
10        for(int i=0; i<n; i++){
11            if(nums[i] < mx){
12                p1=i;
13            }
14            mx = Math.max(mx, nums[i]);
15        }
16
17        for(int i=n-1; i>=0; i--){
18            if(nums[i] > mi){
19                p2=i;
20            }
21            mi = Math.min(mi, nums[i]);
22        }
23        
24        if(p2 == -1) return 0;
25
26        return p1-p2+1;
27    }
28}