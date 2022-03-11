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
    public ListNode rotateRight(ListNode head, int k) {
       
       int n = 1;
         if(head==null)return head;
       ListNode t = head;
       while(t.next!=null){
           t=t.next;
           n++;
       }
        t.next=head;
        k=k%n;
        int m = n-k-1;
        while(m-->0){
           head=head.next; 
        }
        t=head.next;
        head.next=null;
        return t;
    }
}