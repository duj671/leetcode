/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null){
            return;
        }
        // 用下一个节点的值覆盖当前节点
        node.val = node.next.val;
        // 删除下一个节点
        node.next = node.next.next;
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}
