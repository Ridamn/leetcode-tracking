// Last updated: 5/16/2026, 9:06:33 AM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int p1=0;
4        int p2=arr.length-1;
5
6        while(p1<=p2){
7            int mid = p1 + (p2-p1)/2;
8
9            int ans = arr[mid] - (mid+1);
10
11            if(ans < k) p1 = mid+1;
12            else p2 = mid-1;
13        }
14        return p1+k;
15    }
16}