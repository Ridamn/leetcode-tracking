# Last updated: 5/11/2026, 9:54:25 AM
class Solution:
    def minCuttingCost(self, n: int, m: int, k: int) -> int:
        ans, ans2 = 0, 0
        result = 0
        if m> k:
            ans = m-k
        if n> k:
            ans2 = n-k
        if ans + ans2 <= k:
            result = (ans * k) + (ans2 * k) 
        return result