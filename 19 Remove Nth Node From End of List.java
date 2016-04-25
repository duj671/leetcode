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
        // ��������ָ�룬һ����ָ�룬һ����ָ�룬�ÿ�ָ����ǰ�ƶ�n����Ȼ�����ָ��ͬʱ�ƶ���
        // ����ָ�뵽��β����ʱ����ָ����ǵ�����n+1��
        // �ų���ͷ����nΪ0�����������null
        if(head == null || n == 0){
            return null;
        }
        // ��ָ��ָ��ͷ���
        ListNode slow = head;
        ListNode fast = head;
        // ���ڿ�ָ��ָ�����ͷ���n��λ�ýڵ�
        for (int i =0; i<n;i++){
            fast = fast.next;
        }
        // ���fast�ڵ�Ϊ����n>=�ڵ����
        if(fast == null){
            //ɾ����һ���ڵ�
            head = head.next;
            return head;
        }
        // ����ָ��ͬʱ��ǰ�ƶ�
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // �ҵ�ɾ���Ľڵ�ǰһ���ڵ�ָ��ɾ���ڵ����һ���ڵ�
        ListNode tempNode = slow.next.next;
        slow.next = tempNode;
        return head;
    }
}
