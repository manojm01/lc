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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        ListNode temp_prev = null;
        ListNode temp2 = head;
        
        for(int i=1;i<left;i++){
            temp_prev = temp;
            temp = temp.next;
        }
         for(int i=1;i<right;i++){
            temp2 = temp2.next;
        }
        ListNode temp2_next = temp2.next;
        // System.out.println(temp.val +" "+ temp2.val);
        ListNode prev = temp;
        ListNode curr = temp.next;
        ListNode next = curr;
        
        while(curr != temp2_next){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(temp_prev != null)
        temp_prev.next = temp2;
        temp.next = curr;
        
        if(temp==head){
            return prev;
        }
        return head;
    }
}

