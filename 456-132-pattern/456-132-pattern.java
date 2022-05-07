class Solution {
    public boolean find132pattern(int[] a) {
        Stack<Integer> s = new Stack<>();
        int n = a.length;
        if(n<3)return false;
        int lmini[] = new int [n];
        lmini[0]=a[0];
        
        for(int i=1;i<n;i++){
            lmini[i] = Math.min(lmini[i-1],a[i]);
        }
        
        for(int i=n-1;i>=0;i--){
            if(a[i]>lmini[i]){
                while(!s.isEmpty() && s.peek()<=lmini[i])s.pop();
                
                if(!s.isEmpty() && s.peek()<a[i])return true;
                
                s.push(a[i]);
            }
         }
        return false;
    }
}