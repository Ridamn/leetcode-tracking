# Last updated: 5/11/2026, 10:00:11 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x >= 0:
            n = str(x)[::-1]
        else:
            return False
        if int(n) == x:
            return True
        return False
        
        