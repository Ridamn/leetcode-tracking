// Last updated: 5/11/2026, 9:55:44 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=0;
        for(int i=0; i<words.length; i++){
            if(words[i].startsWith(pref)) n++;
        }
        return n;
    }
}