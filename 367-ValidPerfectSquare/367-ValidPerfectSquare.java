// Last updated: 5/11/2026, 9:57:51 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        int sq = (int) Math.sqrt(num);
        if(sq*sq == num) return true;
        return false;
    }
}