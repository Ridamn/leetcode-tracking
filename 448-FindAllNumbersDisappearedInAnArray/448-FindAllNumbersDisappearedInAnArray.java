// Last updated: 6/17/2026, 8:45:44 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i : nums){
            if(!mp.containsKey(i)) mp.put(i, 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=nums.length; i++){
            if(!mp.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}