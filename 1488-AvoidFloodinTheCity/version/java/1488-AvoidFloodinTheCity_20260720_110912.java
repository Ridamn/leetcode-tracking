// Last updated: 7/20/2026, 11:09:12 AM
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
17                    int s = 0;
18                    int e = arr.size()-1;
19                    while(s <= e){
20                        int mid = (s+e)/2;
21                        if(arr.get(mid) > idx){
22                            dI = mid;
23                            e = mid-1;
24                        }else{
25                            s = mid + 1;
26                        }
27                    }
28                    if(dI == -1) return new int[0];
29                    ans[arr.get(dI)] = curr;
30                    arr.remove(dI);
31                }
32                mp.put(curr, i);
33            }
34        }
35        return ans;
36    }
37}