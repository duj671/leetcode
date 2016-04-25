/**
* Given a linked list, remove the nth node from the end of list and return its head.
* For example,
* Given linked list: 1->2->3->4->5, and n = 2.
* After removing the second node from the end, the linked list becomes 1->2->3->5.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 创建两个指针，一个快指针，一个慢指针，让快指针向前移动n个，然后快慢指针同时移动，
        // 当快指针到达尾部的时候，慢指针就是倒数第n+1个
        // 排除当头结点和n为0的情况，返回null
        if(head == null || n == 0){
            return null;
        }
        // 慢指针指向头结点
        ListNode slow = head;
        ListNode fast = head;
        // 调节快指针指向距离头结点n的位置节点
        for (int i =0; i<n;i++){
            fast = fast.next;
        }
        // 如果fast节点为空则n>=节点个数
        if(fast == null){
            //删除第一个节点
            head = head.next;
            return head;
        }
        // 快慢指针同时向前移动
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // 找到删除的节点前一个节点指向删除节点的下一个节点
        ListNode tempNode = slow.next.next;
        slow.next = tempNode;
        return head;
    }
}
