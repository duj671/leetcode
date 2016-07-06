/**
* Given a singly linked list, determine if it is a palindrome.
**/

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }else {
            // 快慢指针
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            // 偶数
            if(fast == null){
                ListNode node = resverseLinkedList(slow);
                return isSame(head, node);
            }else {
                ListNode node = resverseLinkedList(slow.next);
                return isSame(head, node);
            }
        }
    }

    private boolean isSame(ListNode nodea, ListNode nodeb){
        while (nodea != null && nodeb != null) {
            if (nodea.val == nodeb.val) {
                nodea = nodea.next;
                nodeb = nodeb.next;
            } else {
                return false;
            }
        }
        return true;
    }

    // 反转链表
    private ListNode resverseLinkedList(ListNode node){
        if(node == null){
            return null;
        }
        ListNode temp = null;
        ListNode pre = null;
        while (node != null){
            temp = node;
            node = node.next;
            temp.next = pre;
            pre = temp;
        }
        return temp;
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}