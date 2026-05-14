// Last updated: 5/14/2026, 10:26:01 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max = 0;
4        int max2 = 0;
5        for(int i=0; i<nums.length; i++){
6            if(nums[i] > max){
7                max2 = max;
8                max = nums[i];
9            }
10            
11            else max2 = Math.max(max2, nums[i]);
12            System.out.println("max "+max+" max2 "+max2);
13        }
14
15        return (max-1)*(max2-1);
16        
17    }
18}