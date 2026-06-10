// Last updated: 6/10/2026, 9:28:37 AM
1class Solution {
2
3    public double myPow(double x, int n) {
4        if(n==0) return 1;
5        long N = n;
6        if(N < 0){
7            N = -N;
8            x = 1/x;
9        }
10        return pow(x, N);
11    }
12
13    public double pow(double a, long n){
14        if(n==0) return 1;
15        double ans = pow(a, n/2);
16
17        if(n % 2 == 1) return ans * ans * a;
18        else return ans*ans;
19    }
20
21}