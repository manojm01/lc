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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        ListNode t = head;
        int n=0;
        
        while(t!=null){
            l.add(t.val);
            t=t.next;
            n++;
        }
        int a[] = new int[n];
        a[n-1]=0;
        Stack<Integer> st = new Stack<>();
        st.push(l.get(n-1));
        int i=n-2;
        
        while(st.size()!=0 && i>=0){
           
            while(st.size()!=0 && st.peek()<=l.get(i)){
                st.pop();
            }
            if(st.size()==0){
                a[i] = 0;
            }
            else{
                a[i] = st.peek();
            }
            st.push(l.get(i));
            i--;
        }
        return a;
    }
}