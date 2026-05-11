# Last updated: 5/11/2026, 9:54:16 AM
import math
def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True


class Solution:
    def checkPrimeFrequency(self, nums: List[int]) -> bool:
        if len(nums) == len(set(nums)):
            return False
        d = {}
        for i in nums:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1
            

        for i in d.values():
            if is_prime(i):
                return True

        return False
        