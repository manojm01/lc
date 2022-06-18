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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
        
        ListNode curr = head;
        ListNode prev = head;
        curr = curr.next;
        
        while(curr!=null){
            
            if(curr.val==prev.val){
                prev.next = curr.next;
                curr=curr.next;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
            
        }
        return head;
    }
}