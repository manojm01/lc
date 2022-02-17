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
        ListNode i =new ListNode(0);
        i.next = head;
        ListNode j = i;
        ListNode k = head;
        
        while(k != null){
            if(k.next!=null && k.val == k.next.val){
                while(k.next!=null && k.val == k.next.val)
                {
                    k = k.next;
                } 
                j.next = k.next;
            }else{
                j = j.next;
            }
       
            k = k.next;
        }
        
        return i.next;
    }
}