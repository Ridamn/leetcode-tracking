// Last updated: 5/11/2026, 10:00:12 AM
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length() == 0) return 0;
        int sign = 1;
        long n = 0;

        int i=0;
        if(s.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }

        while(i<s.length()){
            if(s.charAt(i) < '0' || s.charAt(i) > '9') break;

            n = n * 10 + (s.charAt(i) - '0');
            if(sign * n > Integer.MAX_VALUE) return Integer.MAX_VALUE;
          if(sign * n < Integer.MIN_VALUE) return Integer.MIN_VALUE;  
          i++;
        }
        return (int) (n*sign);
    }
}