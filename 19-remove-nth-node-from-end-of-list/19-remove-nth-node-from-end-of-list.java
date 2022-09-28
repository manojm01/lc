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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        ListNode r = head;
        
        if(head.next==null)return null;
        
        while(n-->0){
            r=r.next;
        }
        
        if(r==null)return l.next;
        
        while(r.next!=null){
            r=r.next;
            l=l.next;
        }
        l.next = l.next.next;
        return head;
    }
}