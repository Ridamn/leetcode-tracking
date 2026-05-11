# Last updated: 5/11/2026, 9:54:15 AM
class Solution(object):
    def checkDivisibility(self, n):
        c = 0
        c2 = 1
        for i in str(n):
            i = int(i)
            c += i
            c2 *= i

        if n % (c+c2) == 0:
            return True
        return False