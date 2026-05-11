// Last updated: 5/11/2026, 9:56:31 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = nums.clone();
        Arrays.sort(arr);

        for(int i=0; i<nums.length; i++){
            map.putIfAbsent(arr[i], i);
        }

        for(int i=0; i<nums.length; i++){
            arr[i] = map.get(nums[i]);
        }
        return arr;
    }
}