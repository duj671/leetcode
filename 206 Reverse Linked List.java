/**
* Reverse a singly linked list.
**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        // 最后的头结点
        ListNode reverseHead = null;
        // 临时节点
        ListNode tempNode = null;
        while (head != null){
            // 把当前节点指向下一个节点的指针存起来
            ListNode nodeNext = head.next;
            // 如果遍历至尾节点，这个节点则为反转链表的表头
            if(nodeNext == null){
                reverseHead = head;
            }
            // 把当前节点指向下一个节点的指针指向临时节点
            head.next = tempNode;
            // 把当前节点复制给临时节点
            tempNode = head;
            // 把当前节点跳转为下一个要反转的节点
            head = nodeNext;
        }
        return reverseHead;
    }
}