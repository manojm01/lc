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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while(l1 !=null ||  l2!=null){
            int s = 0;
            if(l1 != null){s += l1.val;l1=l1.next;}
            if(l2 != null){s += l2.val;l2=l2.next;}
            s += c;
            c = s / 10;
            temp.next = new ListNode(s % 10);
            temp = temp.next;
        }
        if(c == 1)temp.next  = new ListNode(1);
        
        return ans.next;
    }
}