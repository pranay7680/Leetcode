/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null||left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        int l=1;
        while(curr!=null && l!=left){
            prev=curr;
            curr=curr.next;
            l++;
        }
        ListNode fake=curr;
        while(curr.next!=null &&l!=right){
            ListNode temp=curr.next;
            curr.next=temp.next;
            temp.next=fake;
            fake=temp;
            prev.next=temp;
            l++;
        }
        return dummy.next;
    }
}