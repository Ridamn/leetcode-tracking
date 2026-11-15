// Last updated: 11/15/2026, 12:59:59 PM
1class Solution {
2    public int[] findEvenNumbers(int[] digits) {
3        int[] count = new int[10];
4        for(int i : digits){
5            count[i]++;
6        }
7        Deque<Integer> ans = new ArrayDeque<>();
8        for(int i = 1; i < 10; ++i)
9        {
10            if(count[i] == 0){ continue; }
11            count[i]--;
12            for(int j = 0; j < 10; ++j)
13            {
14                if(count[j] == 0){ continue; }
15                count[j]--;
16                for(int k = 0; k < 10; k+=2)
17                {
18                    if(count[k] == 0){ continue; }
19                    ans.addLast(i*100+j*10+k);
20                }
21                count[j]++;
22            }
23            count[i]++;
24        }
25        int[] result = new int[ans.size()];
26        int idx = 0;
27
28        for(int num : ans) {
29            result[idx++] = num;
30        }
31
32        return result;
33    }
34
35}