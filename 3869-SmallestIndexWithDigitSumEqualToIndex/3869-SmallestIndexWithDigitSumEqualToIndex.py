# Last updated: 5/11/2026, 9:54:28 AM
class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        def digit_sum(n: int) -> int:
            return sum(int(d) for d in str(abs(n)))
        
        for i , num in enumerate(nums):
            if digit_sum(num) == i:
                return i
        return -1
        