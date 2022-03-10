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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t = new ListNode(-1);
        ListNode ans = t;
        int sum=0;
        int carry=0;
        while(l1!=null || l2!=null){
            sum=0;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            sum = sum%10;
            t.next  = new ListNode(sum);
            t = t.next;
        }
        if(carry==1)t.next = new ListNode(1);
        return ans.next;
    }
}