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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* m = new ListNode(0);
        ListNode* l = m ;
        while(l1 && l2) {
            if(l1 -> val < l2 -> val) {
                l -> next = l1;
                l1 = l1->next;
            } else {
                l -> next = l2;
                l2 = l2->next;
            }
            l = l->next;
        }
        if(l1) l -> next = l1;
        if(l2) l -> next = l2;
        return m->next;
    }
};