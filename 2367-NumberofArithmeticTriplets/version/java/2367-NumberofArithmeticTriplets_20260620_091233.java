// Last updated: 6/20/2026, 9:12:33 AM
1class Solution {
2    public int arithmeticTriplets(int[] nums, int diff) {
3        HashSet<Integer> set = new HashSet<>();
4
5        for(int i : nums){
6            set.add(i);
7        }
8        int c=0;
9        for(int i : nums){
10            if(set.contains(i + diff) && set.contains(i + 2 * diff)) c++;
11        }
12        return c;
13    }
14}
15