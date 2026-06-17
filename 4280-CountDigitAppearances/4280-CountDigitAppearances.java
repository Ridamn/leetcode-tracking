// Last updated: 6/17/2026, 8:41:18 AM
class Solution {
    public int countDigitOccurrences(int[] nums, int d) {
        int ans=0;

        for(int i : nums){
            while(i != 0){
                int n = i%10;
                // System.out.println("n : " + n);
                if(n==d) ans++;
                // System.out.println("ans : "+ ans);
                i /= 10;
                // System.out.println("i : "+ i);
            }
        }
        return ans;
    }
}