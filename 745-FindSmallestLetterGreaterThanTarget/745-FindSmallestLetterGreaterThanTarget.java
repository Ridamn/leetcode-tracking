// Last updated: 5/11/2026, 9:57:11 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0; i<letters.length; i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}