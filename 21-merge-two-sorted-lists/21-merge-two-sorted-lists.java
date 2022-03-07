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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1==null)return l2;
       if(l2==null)return l1;
       
       
        if(l1.val>l2.val){
            ListNode t = l1;
            l1=l2;
            l2=t;
        }
        ListNode ans = l1;
        while(l1!=null&&l2!=null){
            ListNode tt = null;
            while(l1!=null && l1.val<=l2.val){
                tt=l1;
                l1=l1.next;
            }
            tt.next=l2;
            ListNode t = l1;
            l1=l2;
            l2=t;
         }
        return ans;
    }
}