// Last updated: 5/18/2026, 1:26:02 PM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int p1 = 0;
4        int p2 = 0;
5
6        for(int i : weights){
7            p1 = Math.max(p1, i);
8            p2 += i;
9        }
10
11        while(p1 < p2){
12            int mid = p1 + (p2 - p1) / 2;
13
14            if(check(weights, days, mid)){
15                p2 = mid;
16            }
17            else{
18                p1 = mid + 1;
19            }
20        }
21
22        return p1;
23    }
24
25
26
27    public boolean check(int[] arr, int d, int mid){
28        int c = 1;
29        int sum = 0;
30
31        for(int i : arr){
32            if(i>mid) return false;
33            if(sum + i > mid){
34                c++;
35                sum = i;
36            }
37            else{
38                sum += i;
39            }
40
41            if(c > d) return false;
42        }
43
44        return true;
45    }
46}