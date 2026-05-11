# Last updated: 5/11/2026, 9:54:35 AM
class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        def digit_sum(n):
            return sum(int(d) for d in str(n))
    
        sorted_nums = sorted(nums, key=lambda x: (digit_sum(x), x))

        index_map = {num: i for i, num in enumerate(nums)}

        visited = [False] * len(nums)
        swap = 0

        for i in range(len(nums)):
            if visited[i] or sorted_nums[i] == nums[i]:
                continue

            cycle_length = 0
            j = i

            while not visited[j]:
                    visited[j] = True
                    next_value = sorted_nums[j]
                    j = index_map[next_value]
                    cycle_length += 1

            if cycle_length > 1:
                swap += cycle_length - 1

        return swap