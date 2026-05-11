# Last updated: 5/11/2026, 9:59:22 AM
from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m - 1           # Pointer to last element in nums1's valid part
        j = n - 1           # Pointer to last element in nums2
        k = m + n - 1       # Pointer to the last index of nums1

        # Merge nums1 and nums2 from the end
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1

        # If nums2 has remaining elements, copy them
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1

        