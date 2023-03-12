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
    int pairSum(ListNode* head) {
        stack<int> st;
        int maxi=0;
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast!=NULL) {
            st.push(slow->val);
            slow=slow->next;
            fast=fast->next->next;
        }
        while(slow!=NULL) {
            maxi = max(slow->val+st.top(),maxi);
            st.pop();
            slow=slow->next;
        }
        return maxi;
    }
};
