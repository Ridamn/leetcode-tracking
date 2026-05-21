// Last updated: 5/21/2026, 10:57:11 AM
1class Solution {
2    public int[] applyOperations(int[] nums) {
3        int p1=0;
4        for(int p2=1; p2<nums.length; p2++){
5            if(nums[p1] != nums[p2]) p1++;
6            else if(nums[p1] == nums[p2]){
7                nums[p1] *= 2;
8                nums[p2] = 0;
9                p1++;
10            }
11        }
12        p1=0;
13        for(int p2=0; p2<nums.length; p2++){
14            if(nums[p2] != 0){
15                nums[p1] = nums[p2];
16                p1++;
17            }
18        }
19        while(p1<nums.length){
20            nums[p1]=0;
21            p1++;
22        }
23
24        return nums;
25    }
26}