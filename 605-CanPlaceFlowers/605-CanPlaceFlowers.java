// Last updated: 5/11/2026, 9:57:28 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean l = (i == 0) || (flowerbed[i - 1] == 0);
                boolean r = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (l && r) {
                    flowerbed[i] = 1; 
                    c++;            
                }
            }
        }

        return c >= n;
    }
}
