// Last updated: 5/13/2026, 10:01:14 AM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int p1 = 0;
4        int p2 = arr.length-1;
5
6        while(p1<p2){
7            int mid = p1 + (p2-p1)/2;
8            if(arr.length < 3){
9                return arr[1];
10            }
11
12            if(mid + 1 < arr.length && arr[mid] < arr[mid+1]){
13                p1 = mid + 1;
14            }
15            else p2 = mid;
16        }
17        return p1;
18    }
19}