// Last updated: 5/20/2026, 10:08:46 AM
1class Solution {
2    public int maximumCandies(int[] candies, long k) {
3        // if(k>candies.length) return 0;
4
5        int p1=1;
6        int p2=0;
7        
8        for(int i : candies) p2 = Math.max(p2, i);
9
10        int ans=0;
11
12        while(p1<=p2){
13            int mid=p1+(p2-p1)/2;
14
15            if(check(candies, k, mid)){
16                ans = mid;
17                p1 = mid+1;
18            }
19            else p2 = mid-1;
20        }
21
22        return ans;
23    }
24
25    public boolean check(int[] arr, long k, int mid){
26        long c=0;
27
28        for(int i : arr){
29            c += i/mid;
30            
31        }
32        return c >= k;
33    }
34}