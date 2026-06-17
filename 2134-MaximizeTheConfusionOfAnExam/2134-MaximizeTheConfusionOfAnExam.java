// Last updated: 6/17/2026, 8:43:33 AM
class Solution {
    public int maxConsecutiveAnswers(String ans, int k) {
        int j=0;
        int n=ans.length();
        int res=0;
        // int T=0, F=0;
        // for(int i=0; i<n; i++){
        //     if(ans.charAt(i) == 'T') T++;
        //     else F++;
        // }
        // char maxFre = (T > F) ? 'T' : 'F';
        int kk = k;
        char maxFre = 'T';
        for(int i=0; i<n; i++){
            char c = ans.charAt(i);
            while(c != maxFre && kk == 0){
                if(ans.charAt(j) != maxFre){
                    kk++;
                }
                j++;
            }
            if(c != maxFre){
                kk--;
            }
            res = Math.max(res, i-j+1);
        }
        j=0;
        int ress=0;
        // int T=0, F=0;
        // for(int i=0; i<n; i++){
        //     if(ans.charAt(i) == 'T') T++;
        //     else F++;
        // }
        // char maxFre = (T > F) ? 'T' : 'F';
        maxFre = 'F';
        for(int i=0; i<n; i++){
            char c = ans.charAt(i);
            while(c != maxFre && k == 0){
                if(ans.charAt(j) != maxFre){
                    k++;
                }
                j++;
            }
            if(c != maxFre){
                k--;
            }
            ress = Math.max(ress, i-j+1);
        }
        return Math.max(ress, res);
    }
}