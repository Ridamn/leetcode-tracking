# Last updated: 5/11/2026, 9:59:26 AM
class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        nums.sort()
        if target in nums:
            return True
        else:
            return False