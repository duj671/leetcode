/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class Solution {
    public Solution.ListNode mergeTwoLists(Solution.ListNode l1, Solution.ListNode l2) {
        Solution.ListNode listNode = null;
        Solution.ListNode head = null;

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 != null && l2 == null) {
            head = l1;
        } else if (l1 == null && l2 != null) {
            head = l2;
        } else {
            if (l1.val < l2.val) {
                head = l1;
                l1 = l1.next;
            } else {
                head = l2;
                l2 = l2.next;
            }
            listNode = head;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    listNode.next = l1;
                    listNode = l1;
                    l1 = l1.next;
                } else {
                    listNode.next = l2;
                    listNode = l2;
                    l2 = l2.next;
                }
            }

            if (l1 != null) {
                listNode.next = l1;
            }

            if (l2 != null) {
                listNode.next = l2;
            }
        }

        return head;
    }
}