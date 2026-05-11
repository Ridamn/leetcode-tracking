// Last updated: 5/11/2026, 9:55:01 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];

        for(int i : nums){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        
        for(int i : nums){
            if(mp.get(i) == 2){
                ans[0] = i;
                break;
            }
        }
        for(int i : nums){
            if(mp.get(i) == 2 && ans[0] != i){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}