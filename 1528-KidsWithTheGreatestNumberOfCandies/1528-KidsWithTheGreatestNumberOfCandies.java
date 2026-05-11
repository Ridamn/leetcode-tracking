// Last updated: 5/11/2026, 9:56:30 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int n = candies[0];

        for(int i=1; i<candies.length; i++){
            if(candies[i] > n){
                n = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies < n){
                arr.add(false);
            }
            else arr.add(true);
        }
        return arr;
    }
}