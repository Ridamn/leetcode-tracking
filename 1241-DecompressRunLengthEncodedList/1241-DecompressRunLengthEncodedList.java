// Last updated: 5/11/2026, 9:56:43 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<nums.length; i+=2){
            for(int j=0; j<nums[i]; j++){
                ls.add(nums[i+1]);
            }
        }
        int[] ans = new int[ls.size()];
        for(int i=0;i<ls.size();i++) ans[i]=ls.get(i);

        return ans;
    }
}