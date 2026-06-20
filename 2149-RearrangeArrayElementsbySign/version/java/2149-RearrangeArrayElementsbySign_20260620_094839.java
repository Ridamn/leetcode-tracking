// Last updated: 6/20/2026, 9:48:39 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int[] arr1 = new int[nums.length/2];
4        int[] arr2 = new int[nums.length/2];
5    
6        int p1=0;
7        int p2=0;
8
9        for(int i=0; i<nums.length; i++){
10            if(nums[i] >= 0){
11                arr1[p1] = nums[i];
12                p1++;
13            }
14            else{
15                arr2[p2] = nums[i];
16                p2++;
17            }
18        }
19
20        int j=0;
21        int i=0;
22        while(i < nums.length){
23            nums[i] = arr1[j];
24            i++;
25            nums[i] = arr2[j];
26            i++;
27            j++;
28        }
29        return nums;
30    }
31}