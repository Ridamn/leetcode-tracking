// Last updated: 5/11/2026, 9:55:57 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=0;
        for(String i : operations){
            if("--X".equals(i) || "X--".equals(i)) n--;
            else n++;
        }
        return n;
    }
}