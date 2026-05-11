# Last updated: 5/11/2026, 9:59:43 AM
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        d = []

        if target not in nums:
            return [-1,-1]

        for i in range(len(nums)):
            if nums[i] == target:
                d.append(i)
                break
        for i in range(len(nums)-1,-1,-1):
            if nums[i] == target:
                d.append(i)
                break
        return d
        