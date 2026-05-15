// Last updated: 5/15/2026, 1:27:07 PM
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        List<Character> arr = new ArrayList<>();
4
5        for(int i : nums){
6            String s = Integer.toString(i);
7
8            for(int j=0; j<s.length(); j++){
9                arr.add(s.charAt(j));
10            }
11        }
12        
13        return arr.stream()
14              .mapToInt(Character::getNumericValue)
15              .toArray(); 
16    }
17}