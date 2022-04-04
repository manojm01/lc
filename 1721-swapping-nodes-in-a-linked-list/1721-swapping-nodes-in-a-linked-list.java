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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode t = head;
        ListNode s = head;
        int x=1;
        
        while(t.next != null){
            t=t.next;
            x++;
        }
        t=head;
        int z=x-k;
        
        while(z>0){ 
            t=t.next;
            z--;
         }
        while(k-->1){
            s=s.next;
        }
        int temp = s.val;
        s.val = t.val;
        t.val=temp;
        
        return head;
    }
}