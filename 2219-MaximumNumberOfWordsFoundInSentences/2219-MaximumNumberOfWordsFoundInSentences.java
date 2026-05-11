// Last updated: 5/11/2026, 9:55:52 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        if(sentences.length==0)return 0;
        int ans = 0;
        for(String i : sentences){
            if(i.length()==0) continue;
            int n=1;
            i = i.trim();
            for(int j=0; j<i.length(); j++){
                if(i.charAt(j) == ' ') n++;
            }
            ans = Math.max(ans, n);
            n=1;
        }
        return ans;
    }
}