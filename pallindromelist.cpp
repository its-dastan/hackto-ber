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
    bool isPalindrome(ListNode* head) {
        return isSame(head, head);
    }
    
    bool isSame(ListNode*& head, ListNode* node) {
        if(!node) return true;
        bool isPal = isSame(head, node->next);
        if(head->val != node->val) return false;
        head = head->next;
        return isPal;
    }
};