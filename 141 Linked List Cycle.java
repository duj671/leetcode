/**
 * Given a linked list, determine if it has a cycle in it.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null || head.next == null){
            return false;
        }
        if (head.next.next != null){
            while (slow != null && fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
        }
        return false;
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}