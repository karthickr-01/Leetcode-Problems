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
    ListNode* deleteDuplicates(ListNode* head) {
        if(!head)  return head;
        ListNode* dummy=new ListNode(0);
        dummy->next=head;
        ListNode* itr = dummy;
        while(itr->next && itr->next->next) {
            if(itr->next->val==itr->next->next->val) {
                int var = itr->next->val;
                while(itr->next!=NULL && itr->next->val==var) {
                    itr->next=itr->next->next;
                }
            }
            
            else itr=itr->next;
        }
        return dummy->next;
    }
};
