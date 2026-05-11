# Last updated: 5/11/2026, 9:57:16 AM
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewels_set = set(jewels)

        return sum(stone in jewels_set for stone in stones)
        