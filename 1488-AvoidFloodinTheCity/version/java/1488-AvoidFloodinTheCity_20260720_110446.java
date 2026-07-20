// Last updated: 7/20/2026, 11:04:46 AM
1class Solution {
2    public int[] avoidFlood(int[] rains) {
3        Map<Integer, Integer> mp = new HashMap<>();
4        int n=rains.length;
5        int[] ans = new int[n];
6        Arrays.fill(ans, 1);
7        List<Integer> arr = new ArrayList<>();
8
9        for(int i=0; i<n; i++){
10            int curr = rains[i];
11            if(curr == 0) arr.add(i);
12            else{
13                ans[i] = -1;
14                if(mp.containsKey(curr)){
15                    int idx = mp.get(curr);
16                    int dI = -1;
17                    for(int j=0; j<arr.size(); j++){
18                        if(arr.get(j) > idx){
19                            dI = j;
20                            break;
21                        }
22                    }
23                    if(dI == -1) return new int[0];
24                    ans[arr.get(dI)] = curr;
25                    arr.remove(dI);
26                }
27                mp.put(curr, i);
28            }
29        }
30        return ans;
31    }
32}