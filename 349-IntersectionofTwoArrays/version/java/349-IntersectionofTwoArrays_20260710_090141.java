// Last updated: 7/10/2026, 9:01:41 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> arr = new HashMap<>();
4        
5        for(String i : strs){
6            char[] chars = i.toCharArray();
7            Arrays.sort(chars);
8            String sorted = new String(chars);
9            if(!arr.containsKey(sorted)){
10                arr.put(sorted, new ArrayList<>());
11            }
12            arr.get(sorted).add(i);
13        }
14        return new ArrayList<>(arr.values());
15    }
16}