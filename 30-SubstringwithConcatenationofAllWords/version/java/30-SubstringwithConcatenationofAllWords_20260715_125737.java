// Last updated: 7/15/2026, 12:57:37 PM
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3        int n = words.length;
4        Map<String, Integer> mp = new HashMap<>();
5
6        for (String str : words) {
7            mp.put(str, mp.getOrDefault(str, 0) + 1);
8        }
9
10        List<Integer> ans = new ArrayList<>();
11        int wordSize = words[0].length();
12
13        for (int i = 0; i < wordSize; i++) {
14            int l = i;
15            int r = i;
16            int count = 0;
17            Map<String, Integer> curr = new HashMap<>();
18
19            while (r + wordSize <= s.length()) {
20                String sub = s.substring(r, r + wordSize);
21                r += wordSize;
22
23                if (!mp.containsKey(sub)) {
24                    curr.clear();
25                    count = 0;
26                    l = r;
27                    continue;
28                }
29
30                curr.put(sub, curr.getOrDefault(sub, 0) + 1);
31                count++;
32
33                while (curr.get(sub) > mp.get(sub)) {
34                    String temp = s.substring(l, l + wordSize);
35                    curr.put(temp, curr.get(temp) - 1);
36                    l += wordSize;
37                    count--;
38                }
39
40                if (count == n) {
41                    ans.add(l);
42
43                    String temp = s.substring(l, l + wordSize);
44                    curr.put(temp, curr.get(temp) - 1);
45                    l += wordSize;
46                    count--;
47                }
48            }
49        }
50
51        return ans;
52    }
53}