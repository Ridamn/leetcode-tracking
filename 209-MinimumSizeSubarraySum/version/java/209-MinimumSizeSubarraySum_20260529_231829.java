// Last updated: 5/29/2026, 11:18:29 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int j=0;
4        int ans=0;
5        
6        Map<Integer, Integer> mp = new HashMap<>();
7
8        for(int i=0; i<fruits.length; i++){
9            mp.put(fruits[i], mp.getOrDefault(fruits[i], 0)+1);
10            while(mp.size() > 2){
11                mp.put(fruits[j], mp.getOrDefault(fruits[j], 0)-1);
12                if(mp.get(fruits[j])==0) mp.remove(fruits[j]);
13                j++;
14            }
15            ans = Math.max(ans, i-j+1);
16        }
17        return ans;
18    }
19}