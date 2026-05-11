// Last updated: 5/11/2026, 9:58:20 AM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> arr = new ArrayList<>();
        
        int i=0;
        while(i < nums.length){
            int p1 = nums[i];
            int j = i;

            while( j+1 < nums.length && nums[j+1] == nums[j] +1) j++;

            if(nums[j] == p1) arr.add(String.valueOf(p1));
            else arr.add(p1 + "->" + nums[j]);

            i = j+1;
        }
        return arr;
    }
}