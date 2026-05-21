// Last updated: 5/21/2026, 11:55:27 AM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        Arrays.sort(people);
4        int p1=0;
5        int p2=people.length-1;
6        int ans=0;
7
8        while(p1<=p2){
9            if(people[p1] + people[p2] <= limit){
10                p1++;
11                p2--;
12            }else p2--;
13            ans++;
14        }
15        return ans;
16    }
17}