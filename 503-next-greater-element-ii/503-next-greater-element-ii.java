class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n = a.length;
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];
        for(int i:a)s.push(i);
        
        int x[] = new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i++){
            x[i] = a[j++];
            if(j==n)j=0;
        }
        for(int i=0;i<n;i++){
            System.out.print(x[i]+" ");
            int k=i+1;
            for(k=i+1;k<2*n;k++){
                
                if(x[i]<x[k]){
                    // System.out.print(x[i]);
                    ans[i] = x[k];
                    break;
                }
            }
            if(k==2*n)ans[i]=-1;
        }
        // while(s.size()!=0 && i>=0){
        //     while(s.size()!=0 && s.peek()<=a[i]){
        //         s.pop();
        //     }
        //     if(s.size()==0){
        //         ans[i] = -1;
        //     }
        //     else{
        //         ans[i] = s.peek();
        //     }
        //     s.push(a[i--]);
        // }
        return ans;
    }
}