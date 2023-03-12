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
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>();
        int max=0;
        ListNode slow=head, fast = head;
        while(fast!=null) {
            st.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null) {
            max = Math.max(slow.val+st.peek(),max);
            st.pop();
            slow=slow.next;
        }
        return max;
    }
}
