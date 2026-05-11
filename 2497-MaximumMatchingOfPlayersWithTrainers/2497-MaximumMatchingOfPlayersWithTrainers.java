// Last updated: 5/11/2026, 9:55:32 AM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
    Arrays.sort(players);
    Arrays.sort(trainers);
    int ans=0;
    int p1 = 0;
    int p2 = 0;
    
    while(p1<players.length && p2<trainers.length){
        if(players[p1]<=trainers[p2]){
            p1++;
            ans++;
        }
        p2++;
    }
    return ans;
    }
}