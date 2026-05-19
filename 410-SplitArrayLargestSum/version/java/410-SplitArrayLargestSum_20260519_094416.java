// Last updated: 5/19/2026, 9:44:16 AM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int p1 = 0;
4        int p2 = 0;
5        int ans = 0;
6
7        for(int i : nums){
8            p1 = Math.max(p1, i);
9            p2 += i;
10        }
11
12        while(p1 <= p2){
13            int mid = p1 + (p2 - p1) / 2;
14
15            if(check(nums, k, mid)) {
16                ans = mid;
17                p2 = mid - 1;
18            }
19            else {
20                p1 = mid + 1;
21            }
22        }
23
24        return ans;
25    }
26
27    public boolean check(int[] nums, int k, int mid){
28        int c = 1;
29        int sum = 0;
30
31        for(int i : nums){
32            sum += i;
33
34            if(sum > mid){
35                c++;
36
37                if(c > k) return false;
38
39                sum = i;
40            }
41        }
42
43        return true;
44    }
45}