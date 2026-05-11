# Last updated: 5/11/2026, 9:59:51 AM
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        low = 0
        high = len(nums)-1

        while low<=high:
            mid = (low+high)//2
            if target == nums[mid]:
                return mid
            elif nums[mid] < target:
                low = mid + 1
            else:
                high = mid - 1

        return low
        