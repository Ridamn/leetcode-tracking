// Last updated: 5/25/2026, 8:16:48 AM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int c=0;
4
5        for(int i=0; i<k; i++){
6            if(isVowel(s.charAt(i))) c++;
7        }
8
9        int ans = c;
10        for(int i=k; i<s.length(); i++){
11            if(isVowel(s.charAt(i))) c++;
12            if(isVowel(s.charAt(i-k))) c--;
13            ans = Math.max(c, ans);
14        }
15        return ans;
16    }
17    public boolean isVowel(char i){
18        return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u';
19    }
20}