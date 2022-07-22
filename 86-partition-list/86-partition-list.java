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
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallNode = small;
        ListNode big = new ListNode(0);
        ListNode bigNode = big;
        
        while(head!=null){
            if(head.val<x){
                smallNode.next = new ListNode(head.val);
                smallNode = smallNode.next;
            }
            else{
                bigNode.next = new ListNode(head.val);
                bigNode = bigNode.next;
            }
            head = head.next;
        }
        smallNode.next = big.next;
        
        return small.next;
    }
}