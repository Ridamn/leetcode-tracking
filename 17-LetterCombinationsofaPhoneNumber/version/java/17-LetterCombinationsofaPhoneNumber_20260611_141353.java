// Last updated: 6/11/2026, 2:13:53 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        if(digits.length() == 0) return new ArrayList<>();
4        String[] arr = {" ", " ", "abc", "def", "ghi", "jkl", "mno","pqrs", "tuv", "wxyz"};
5        List<String> ans = new ArrayList<>();
6        StringBuilder sb = new StringBuilder();
7        int n = digits.length();
8        combi(digits, sb, n, ans, 0,arr);
9        return ans;
10     }
11
12     public void combi(String s, StringBuilder sb, int n, List<String> ans, int i, String[] arr){
13        if(i>=n){
14            ans.add(sb.toString());
15            return;
16        }
17        String t  = arr[s.charAt(i) - '0'];
18        for(int j=0; j<t.length(); j++){
19            sb.append(t.charAt(j));
20            combi(s, sb, n, ans,i+1, arr);
21            sb.deleteCharAt(sb.length()-1);
22        }
23     }
24}