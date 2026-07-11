/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if(head==nullptr||head->next==nullptr||k==0)
        {
            return head;
        }
        int size=1;
        ListNode *temp=head;
        while(temp->next!=nullptr)
        {
            size++;
            temp=temp->next;
        }
        k=k%size;
        for(int i = 0; i < k; i++){
            ListNode *temp = head;

            while(temp->next->next != NULL){
                temp = temp->next;
            }

            temp->next->next = head;
            head = temp->next;
            temp->next = NULL;
        }

        return head;
    }
};