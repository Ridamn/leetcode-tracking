# Last updated: 5/11/2026, 9:59:00 AM
class Solution:
    def findMin(self, nums: List[int]) -> int:
        nums.sort()
        return nums[0]
        