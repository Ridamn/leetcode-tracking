// Last updated: 5/11/2026, 9:53:44 AM
class Solution {
    public int minimumFlips(int n) {
        String b = Integer.toBinaryString(n);
        int count = 0;

        for (int i = 0; i < b.length(); i++) {
            int j = b.length() - 1 - i;
            if (b.charAt(i) != b.charAt(j)) count++;
        }
        return count;
    }
}
