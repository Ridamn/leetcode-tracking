// Last updated: 6/17/2026, 8:43:06 AM
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Character> arr = new ArrayList<>();

        for(int i : nums){
            String s = Integer.toString(i);

            for(int j=0; j<s.length(); j++){
                arr.add(s.charAt(j));
            }
        }
        
        return arr.stream()
              .mapToInt(Character::getNumericValue)
              .toArray(); 
    }
}