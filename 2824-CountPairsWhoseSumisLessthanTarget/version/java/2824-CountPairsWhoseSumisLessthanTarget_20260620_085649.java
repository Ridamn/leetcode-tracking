// Last updated: 6/20/2026, 8:56:49 AM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int p1=0;
4        int p2=nums.size()-1;
5        int c=0;
6        Collections.sort(nums);
7
8        while(p1<p2){
9            int sum=nums.get(p1)+nums.get(p2);
10
11            if(sum >= target) p2--;
12            else{
13                c += p2-p1;
14                p1++;
15            }
16        }
17        return c;
18    }
19}