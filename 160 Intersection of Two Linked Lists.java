/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 * A:          a1 → a2
                      ↘
                        c1 → c2 → c3
                      ↗            
   B:     b1 → b2 → b3
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (headA != null){
            lengthA ++;
            headA = headA.next;
        }
        while (headB != null){
            lengthB ++;
            headB = headB.next;
        }
        if (lengthA >= lengthB){
            int len = lengthA -lengthB;
            while (len>0){
                len--;
                nodeA = nodeA.next;
            }
        }else {
            int len = lengthB -lengthA;
            while (len>0){
                len--;
                nodeB = nodeB.next;
            }
        }
        while (nodeA != nodeB){
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}