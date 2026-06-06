// Last updated: 6/6/2026, 8:46:58 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder sb = new StringBuilder();
4
5        for(int i=0; i<s.length(); i++){
6            char chars = Character.toLowerCase(s.charAt(i));
7            if(chars <= 'z' && chars >= 'a' || chars <= '9' && chars >= '0') sb.append(chars);
8        }
9        System.out.println(sb);
10        int p1=0; 
11        int p2=sb.length()-1;
12
13        while(p1 <= p2){
14            int mid = p1 + (p2-p1)/2;
15            if(sb.charAt(p1) != sb.charAt(p2)) return false;
16            p1++;
17            p2--;
18        }
19        return true;
20    }
21}