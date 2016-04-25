/**
* Remove all elements from a linked list of integers that have value val.
* Example
* Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
* Return: 1 --> 2 --> 3 --> 4 --> 5 
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
    public ListNode removeElements(ListNode head, int val) {
        // �ÿ���ָ��ķ�ʽ������ָ�����1
        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        ListNode slow = tempNode;
        ListNode fast = head;
        while (fast != null){
            if(fast.val == val){
                slow.next = fast.next;
                fast = fast.next;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return tempNode.next;
    }
}