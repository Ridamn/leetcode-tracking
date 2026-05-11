// Last updated: 5/11/2026, 9:58:35 AM
class Solution {

    public static int sumSquares(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            sum += rem * rem;
            temp /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        if(n <= 0){
            return false;
        }
         int p1 = n;
         int p2 = n;

         do{
            p1 = sumSquares(p1);
            p2 = sumSquares(sumSquares(p2));
         }while(p1 != p2);

         return p1 == 1;
    }
}