// Last updated: 5/11/2026, 9:54:45 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c = 0;
        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<fruits.length; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = -1;
                    c++;
                    break;
                }
                
            }
        }
        return fruits.length-c;
    }
}