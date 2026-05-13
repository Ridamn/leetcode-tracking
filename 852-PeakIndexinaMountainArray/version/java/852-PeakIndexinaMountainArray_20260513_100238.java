// Last updated: 5/13/2026, 10:02:38 AM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int p1 = 0;
4        int p2 = arr.length-1;
5
6        while(p1<p2){
7            int mid = p1 + (p2-p1)/2;
8
9            if(mid + 1 < arr.length && arr[mid] < arr[mid+1]){
10                p1 = mid + 1;
11            }
12            else p2 = mid;
13        }
14        return p1;
15    }
16}