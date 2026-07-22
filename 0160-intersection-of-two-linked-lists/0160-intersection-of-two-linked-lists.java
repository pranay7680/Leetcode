/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> m = new HashSet<>();
        while(headA!=null ||headB!=null){
            if(headA!=null){
                if(m.contains(headA)){
                    return headA;
                }
                m.add(headA);
                headA=headA.next;
            }    
            if(headB!=null){
                if(m.contains(headB)){
                    return headB;
                }
                m.add(headB);
                headB=headB.next;
            }
        }
        return null;
    }
}