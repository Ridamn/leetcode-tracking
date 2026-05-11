# Last updated: 5/11/2026, 9:54:12 AM
from typing import List

class Solution:
    def validateCoupons(self, code: List[str], businessLine: List[str], isActive: List[bool]) -> List[str]:
        order = ["electronics", "grocery", "pharmacy", "restaurant"]
        code2 = []

        for i in range(len(code)):
            if (
                businessLine[i] in order and
                isActive[i] == True and
                len(code[i]) > 0
            ):
                valid = True
                for j in code[i]:
                    val = ord(j)
                    if not (48 <= val <= 57 or 65 <= val <= 90 or 97 <= val <= 122 or val == 95):  # allow '_'
                        valid = False
                        break
                if valid:
                    code2.append((businessLine[i], code[i]))

        code2.sort(key=lambda x: (order.index(x[0]), x[1]))
        return [c[1] for c in code2]