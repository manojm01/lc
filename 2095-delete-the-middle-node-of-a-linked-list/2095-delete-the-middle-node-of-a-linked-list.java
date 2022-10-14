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
    public ListNode deleteMiddle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        int l=1;
        while(s.next!=null){
            s=s.next;l++;
        }
        if(l==1)return null;
        s=head;
        
          for(int i=1;i<=(l/2)-1;i++){
                s=s.next;
            } 
      
            
        s.next=s.next.next;
        return head;
    }
}