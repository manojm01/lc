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
    public ListNode mergeKLists(ListNode[] l) {
        ArrayList<Integer> a = new ArrayList<>();
        
        for(ListNode i:l){
            ListNode t = i;
            while(t !=null){
                a.add(t.val);
                t = t.next;
            }
        }
        Collections.sort(a);
        ListNode ans = new ListNode(-1);
        ListNode d = ans;
        for(int i:a){
           ans.next = new ListNode(i);
           ans = ans.next;
        }
        return d.next;
    }
}