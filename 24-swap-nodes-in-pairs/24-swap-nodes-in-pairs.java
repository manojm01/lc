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
    public ListNode swapPairs(ListNode head) {
        if(head==null)return null;
        ListNode prev = null;
        ListNode f = head.next;
        if(f==null)return head;    
        ListNode sec = f.next;
        f.next = head;
        head.next = swapPairs(sec);
        
        return f;
    }
}