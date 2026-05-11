// Last updated: 5/11/2026, 9:57:41 AM
class Solution {
    public int compress(char[] chars) {
        int p1 = 0; 
        int p2 = 0; 

        while (p2 < chars.length) {
            char current = chars[p2];
            int count = 0;

         
            while (p2 < chars.length && chars[p2] == current) {
                p2++;
                count++;
            }

            chars[p1++] = current;


            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[p1++] = c;
                }
            }
        }

        return p1;
    }
}
