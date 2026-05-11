// Last updated: 5/11/2026, 9:54:06 AM
class Solution {
    public String removeSubstring(String s, int k) {
        StringBuilder stack = new StringBuilder();
        int openCount = 0;
        String merostalin = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.append('(');
                openCount++;
            } else { // ch == ')'
                stack.append(')');
                
                if (stack.length() >= 2 * k) {
                    // check if last k '(' followed by last k ')' form a k-balanced substring
                    boolean isKBalanced = true;
                    for (int j = 0; j < k; j++) {
                        if (stack.charAt(stack.length() - 2*k + j) != '(' ||
                            stack.charAt(stack.length() - k + j) != ')') {
                            isKBalanced = false;
                            break;
                        }
                    }
                    if (isKBalanced) {
                        stack.delete(stack.length() - 2*k, stack.length());
                        openCount -= k;
                        merostalin = stack.toString();  // store midway
                    }
                }
            }
        }

        return stack.toString();
    }
}

