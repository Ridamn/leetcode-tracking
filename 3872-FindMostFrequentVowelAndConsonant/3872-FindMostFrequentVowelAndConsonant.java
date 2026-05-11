// Last updated: 5/11/2026, 9:54:27 AM
class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> v = new HashMap<>();
        Map<Character, Integer> c = new HashMap<>();

        for(char i : s.toCharArray()){
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                v.put(i, v.getOrDefault(i, 0)+1);
            } else {
                c.put(i, c.getOrDefault(i, 0)+1);
            }
        }

        int maxV = v.isEmpty() ? 0 : Collections.max(v.values());
        int maxC = c.isEmpty() ? 0 : Collections.max(c.values());

        return maxV + maxC;
    }
}