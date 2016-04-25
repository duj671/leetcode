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
        // ����ͷ���
        ListNode reverseHead = null;
        // ��ʱ�ڵ�
        ListNode tempNode = null;
        while (head != null){
            // �ѵ�ǰ�ڵ�ָ����һ���ڵ��ָ�������
            ListNode nodeNext = head.next;
            // ���������β�ڵ㣬����ڵ���Ϊ��ת����ı�ͷ
            if(nodeNext == null){
                reverseHead = head;
            }
            // �ѵ�ǰ�ڵ�ָ����һ���ڵ��ָ��ָ����ʱ�ڵ�
            head.next = tempNode;
            // �ѵ�ǰ�ڵ㸴�Ƹ���ʱ�ڵ�
            tempNode = head;
            // �ѵ�ǰ�ڵ���תΪ��һ��Ҫ��ת�Ľڵ�
            head = nodeNext;
        }
        return reverseHead;
    }
}