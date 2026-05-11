// Last updated: 5/11/2026, 9:57:09 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=0;
        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)) n++;
            }
        }
        return n;
    }
}