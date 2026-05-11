# Last updated: 5/11/2026, 9:59:29 AM
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in matrix:
            for j in i:
                if target == j:
                    return True
        return False
        