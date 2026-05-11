// Last updated: 5/11/2026, 9:55:55 AM
class Solution {
    public int minMovesToSeat(int[] seats, int[] s) {
        Arrays.sort(seats);
        Arrays.sort(s);
        int n=0;
        for(int i=0; i<s.length; i++){
            n += Math.abs(seats[i]-s[i]);
        }
        return n;
    }
}