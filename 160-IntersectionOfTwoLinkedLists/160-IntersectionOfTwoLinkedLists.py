# Last updated: 5/11/2026, 9:58:48 AM
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        # S1 = []
        # S2 = []
        p1, p2 = headA, headB
        
        while p1 != p2:
            if p1 is not None:
                p1 = p1.next
            else:
                p1 = headB

            if p2 is not None:
                p2 = p2.next
            else:
                p2 = headA

        return p1

        # while p1 != None:
        #     S1.append(p1)
        #     p1 = p1.next

        # while p2 != None:
        #     S2.append(p2)
        #     p2 = p2.next

        # for i in range(len(max(S1, S2))-1, -1, -1):
        #     prew = S1.pop()
        #     if S1[i] == S2[i]:
        #         S1.pop()
        #         S2.pop()
        #     else:
        #         return prew


        