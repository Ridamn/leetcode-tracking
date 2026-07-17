// Last updated: 7/17/2026, 9:57:54 AM
1class SnapshotArray {
2    int snapID;
3    Map<Integer, List<int[]>> mp;
4
5    public SnapshotArray(int length) {
6        snapID = 0;
7        mp = new HashMap<>();
8    }
9
10    public void set(int index, int val) {
11        if (!mp.containsKey(index)) {
12            mp.put(index, new ArrayList<>());
13            mp.get(index).add(new int[]{snapID, val});
14        } else {
15            List<int[]> list = mp.get(index);
16            if (list.get(list.size() - 1)[0] == snapID) {
17                list.get(list.size() - 1)[1] = val;
18            } else {
19                list.add(new int[]{snapID, val});
20            }
21        }
22    }
23
24    public int snap() {
25        return snapID++;
26    }
27
28    public int get(int index, int snap_id) {
29        if (!mp.containsKey(index)) return 0;
30
31        List<int[]> list = mp.get(index);
32
33        int l = 0, r = list.size() - 1;
34        int ans = 0;
35
36        while (l <= r) {
37            int mid = l + (r - l) / 2;
38
39            if (list.get(mid)[0] <= snap_id) {
40                ans = list.get(mid)[1];
41                l = mid + 1;
42            } else {
43                r = mid - 1;
44            }
45        }
46
47        return ans;
48    }
49}
50/**
51 * Your SnapshotArray object will be instantiated and called as such:
52 * SnapshotArray obj = new SnapshotArray(length);
53 * obj.set(index,val);
54 * int param_2 = obj.snap();
55 * int param_3 = obj.get(index,snap_id);
56 */