/**
* Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
* You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
* Example:
* Given 1->2->3->4->5->NULL,
* return 1->3->5->2->4->NULL. 
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //第一个为奇数节点
        ListNode oddNode =head;
        //第二个为偶数节点
        ListNode evenNode = head.next;
        //偶数头结点
        ListNode evenHead = evenNode;
        while ((evenNode != null)&&(evenNode.next != null)&&(oddNode != null)&&(oddNode.next != null)){
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenHead;
        return head;
    }
}