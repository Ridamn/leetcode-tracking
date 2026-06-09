// Last updated: 6/9/2026, 9:23:11 AM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int idx = word.indexOf(ch);
4
5        if (idx == -1) return word;
6
7        StringBuilder sb = new StringBuilder();
8
9        for (int i = idx; i >= 0; i--) {
10            sb.append(word.charAt(i));
11        }
12
13        for (int i = idx + 1; i < word.length(); i++) {
14            sb.append(word.charAt(i));
15        }
16
17        return sb.toString();
18    }
19}