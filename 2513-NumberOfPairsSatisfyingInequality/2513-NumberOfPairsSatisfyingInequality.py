# Last updated: 5/11/2026, 9:55:30 AM
from typing import List

class Solution:
    def numberOfPairs(self, nums1: List[int], nums2: List[int], diff: int) -> int:
        arr = [a - b for a, b in zip(nums1, nums2)]

        def merge_sort(nums):
            def sort(lo, hi):
                if hi - lo <= 1:
                    return 0
                mid = (lo + hi) // 2
                count = sort(lo, mid) + sort(mid, hi)
                j = mid
                for i in range(lo, mid):
                    while j < hi and nums[i] > nums[j] + diff:
                        j += 1
                    count += hi - j
                nums[lo:hi] = sorted(nums[lo:hi])
                return count

            return sort(0, len(nums))

        return merge_sort(arr)
