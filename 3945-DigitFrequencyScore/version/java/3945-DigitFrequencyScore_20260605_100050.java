// Last updated: 6/5/2026, 10:00:50 AM
1class Solution {
2    public int[] findArray(int[] pref) {
3        int[] arr = new int[pref.length];
4        arr[0] = pref[0];
5        for(int i=1; i<pref.length; i++){
6            arr[i] = pref[i-1] ^ pref[i];
7        }
8        return arr;
9    }
10
11}