// Last updated: 5/11/2026, 9:56:41 AM
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int i=0;
        int ans=0;
        while(i<plants.length){
            int c=capacity;
            while(i < plants.length && c>=plants[i]){
                c -= plants[i];
                ans++;
                i++;
            }
            if(i < plants.length){
                    ans += i*2;
                }
        }
        return ans;
    }
}