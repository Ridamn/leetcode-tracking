# Last updated: 5/11/2026, 10:00:22 AM
## Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

from typing import Optional

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()     # Dummy head node
        current = dummy        # Pointer to build result list
        carry = 0              # Start with no carry

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0  # Get value or 0
            val2 = l2.val if l2 else 0

            total = val1 + val2 + carry
            carry = total // 10

            current.next = ListNode(total % 10)  # Store digit
            current = current.next

            # Advance l1 and l2
            if l1: l1 = l1.next
            if l2: l2 = l2.next

        return dummy.next  # Skip dummy and return actual head
