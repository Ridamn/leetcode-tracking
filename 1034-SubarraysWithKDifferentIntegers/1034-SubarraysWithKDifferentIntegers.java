// Last updated: 5/11/2026, 9:56:52 AM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }


    public static int atMost(int[] nums, int k) {
        int ans = 0;
        // int c = 0;
        int j = 0;

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            
            while(mp.size() > k){
                mp.put(nums[j], mp.getOrDefault(nums[j], 0)-1);
                if(mp.get(nums[j]) == 0) mp.remove(nums[j]);
                j++;
            }
            ans += i-j+1;
        }
        return ans;
    }
}