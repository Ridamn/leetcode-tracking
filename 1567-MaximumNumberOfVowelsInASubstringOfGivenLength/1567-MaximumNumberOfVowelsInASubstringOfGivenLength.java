// Last updated: 6/17/2026, 8:44:07 AM
class Solution {
    public int maxVowels(String s, int k) {
        int c=0;

        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))) c++;
        }

        int ans = c;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i))) c++;
            if(isVowel(s.charAt(i-k))) c--;
            ans = Math.max(c, ans);
        }
        return ans;
    }
    public boolean isVowel(char i){
        return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u';
    }
}