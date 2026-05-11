// Last updated: 5/11/2026, 9:57:48 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (char i : s.toCharArray()) c ^= i;
        for (char i : t.toCharArray()) c ^= i;
        return c;
    }
}