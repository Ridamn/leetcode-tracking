// Last updated: 5/16/2026, 8:21:17 AM
1class Solution {
2    public boolean check(int[] arr,int h,int mid){
3        int c = 0;
4
5        for(int i : arr){
6            c += (i + mid -1)/mid;
7        }
8        return h >= c;
9    }
10    
11    public int minEatingSpeed(int[] piles, int h) {
12        int p1 = 1;
13        int p2 = 0;
14
15        for(int i: piles) p2 = Math.max(p2, i);
16
17        while(p1<p2){
18            int mid = p1 + (p2-p1)/2;
19
20            if(check(piles, h, mid)) p2 = mid;
21
22            else p1 = mid + 1;
23
24        }
25        return p1;
26    }
27}