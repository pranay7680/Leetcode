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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        if(c==0){
            return null;
        }
        k=k%c;
        while(k>0){
        ListNode prev = null;
        ListNode curr=head;
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            curr.next=head;
            head=curr;
            prev.next=null;
            k--;
        }
        dummy.next=head;
        return dummy.next;
    }
}