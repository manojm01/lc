class Solution {
    public boolean validateStackSequences(int[] p1, int[] p2) {
        Stack<Integer> st = new Stack<>();
        int in=0;
        for(int i:p1){
           
            if(st.size()!=0&&st.peek()==p2[in]){
                
                while(st.size()!=0&&st.peek()==p2[in]){
                     st.pop();
                    in++;
                }
               
            }
             st.push(i);
        }
        while(st.size()!=0){
            if(st.peek()!=p2[in]){
                return false;
            }
            in++;
            st.pop();
        }
        return true;
    }
}