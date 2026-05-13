// Last updated: 5/13/2026, 9:32:26 AM
1class Solution {
2    public char nextGreatestLetter(char[] l, char t) {
3        int p1 = 0;
4        int p2 = l.length-1;
5
6        while(p1<=p2){
7            int mid = p1 + (p2-p1)/2;
8
9            if(l[mid] > t) p2 = mid-1;
10            else p1 = mid+1;
11        }
12        return l[p1 % l.length];
13    }
14}