// Last updated: 5/11/2026, 9:54:40 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z) < Math.abs(y-z)) return 1;
        if(Math.abs(x-z) > Math.abs(y-z)) return 2;
        return 0;
    }
}