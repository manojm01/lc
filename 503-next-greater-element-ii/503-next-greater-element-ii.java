class Solution {
    public int[] nextGreaterElements(int[] a) {
        int n = a.length;
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[n];

        
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
        //  int[] res = new int[nums.length];
        // Stack<Integer> stack = new Stack<>();
        // for (int i = 2 * nums.length - 1; i >= 0; --i) {
        //     while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
        //         stack.pop();
        //     }
        //     res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
        //     stack.push(i % nums.length);
        // }
        // return res;
        // *******************************************************
        // for(int i:a)s.push(i);
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