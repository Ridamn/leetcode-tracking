// Last updated: 6/17/2026, 8:41:10 AM
class Solution {
    public int firstUniqueEven(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i : nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }

        for(int i : nums){
            if(mp.get(i) == 1 && i % 2 == 0) return i;
        }
        
        return -1;
    }
}