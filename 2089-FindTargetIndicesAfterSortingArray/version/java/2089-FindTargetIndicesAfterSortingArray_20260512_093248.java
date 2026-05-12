// Last updated: 5/12/2026, 9:32:48 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        Arrays.sort(nums);
4
5        int p1 = lower(nums, target);
6        int p2 = upper(nums, target);
7
8        List<Integer> ans = new ArrayList<>();
9
10        for (int i = p1; i < p2; i++) {
11            ans.add(i);
12        }
13
14        return ans;
15    }
16
17    public int lower(int[] a, int x) {
18        int l = 0, r = a.length;
19
20        while (l < r) {
21            int m = l + (r - l) / 2;
22
23            if (a[m] >= x) r = m;
24            else l = m + 1;
25        }
26
27        return l;
28    }
29
30    public int upper(int[] a, int x) {
31        int l = 0, r = a.length;
32
33        while (l < r) {
34            int m = l + (r - l) / 2;
35
36            if (a[m] > x) r = m;
37            else l = m + 1;
38        }
39
40        return l;
41    }
42}