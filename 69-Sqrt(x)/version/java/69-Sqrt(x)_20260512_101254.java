// Last updated: 5/12/2026, 10:12:54 AM
1class Solution {
2    public int mySqrt(int x) {
3        int p1 = 0;
4        int p2 = x-1;
5        int ans;
6
7        while(p1<=p2){
8            int mid = p1 + (p2-p1)/2;
9
10            if(mid == Math.floor(Math.sqrt(x))) return mid;
11            else if(mid < Math.floor(Math.sqrt(x))){
12                 p1 = mid + 1;
13                 
14            }
15            else {
16                 p2 = mid - 1;
17                  
18            }
19        }
20        return p1;
21    }
22}