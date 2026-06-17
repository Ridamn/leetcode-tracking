// Last updated: 6/17/2026, 8:44:53 AM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int p1=0;
        int p2=people.length-1;
        int ans=0;

        while(p1<=p2){
            if(people[p1] + people[p2] <= limit){
                p1++;
            }
            p2--;
            ans++;
        }
        return ans;
    }
}