# Last updated: 5/11/2026, 9:59:32 AM
class Solution:
    def mySqrt(self, x: int) -> int:
        d = []
        for i in range(1, x+1):
            if i*i <= x:
                d.append(i)
            elif i*i > x:
                break
        if len(d) == 0:
            return 0

        return d[-1]
            
        