// Last updated: 5/11/2026, 9:58:28 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}