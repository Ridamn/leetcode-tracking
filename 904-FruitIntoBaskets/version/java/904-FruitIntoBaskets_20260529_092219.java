// Last updated: 5/29/2026, 9:22:19 AM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int j=0;
4        int max=0;
5        Map<Integer, Integer> mp = new HashMap<>();
6
7        for(int i=0; i<fruits.length; i++){
8            mp.put(fruits[i], mp.getOrDefault(fruits[i], 0)+1);
9
10            while(mp.size() > 2){
11                mp.put(fruits[j], mp.getOrDefault(fruits[j], 0)-1);
12                if(mp.get(fruits[j]) == 0) mp.remove(fruits[j]);
13                j++;
14            }
15            max = Math.max(max, i-j+1);
16        }
17        return max;
18    }
19}