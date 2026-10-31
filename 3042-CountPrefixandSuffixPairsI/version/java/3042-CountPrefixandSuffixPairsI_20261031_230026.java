// Last updated: 10/31/2026, 11:00:26 PM
1class Solution {
2    public int countPrefixSuffixPairs(String[] words) {
3        int n=words.length;
4        int ans=0;
5
6        for(int i=0; i<n; i++){
7            for(int j=i+1; j<n; j++){
8                if(preSuf(words[i], words[j])) ans++;
9            }
10        }
11        return ans;
12    }
13
14    private boolean preSuf(String s1, String s2){
15        int n1=s1.length(), n2=s2.length();
16        if(n1>n2) return false;
17
18        return s2.substring(0, n1).equals(s1) && s2.substring(n2-n1).equals(s1);
19    }
20}