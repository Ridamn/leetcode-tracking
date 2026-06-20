// Last updated: 6/20/2026, 8:46:53 AM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int n= nums.length;
4        int[] ans = new int[n];
5
6        int p1=0;
7        int p2=n-1;
8
9        int i=0;
10        int j=n-1;
11
12        while(i<n){
13            if(nums[i] < pivot){
14                ans[p1++] = nums[i];
15            }
16
17            if(nums[j] > pivot){
18                ans[p2--] = nums[j];
19            }
20
21            i++;
22            j--;
23        }
24
25        while(p1 <= p2){
26            ans[p1++] = pivot;
27        }
28        return ans;
29    }
30}