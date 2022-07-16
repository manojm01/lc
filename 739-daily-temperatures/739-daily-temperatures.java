class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        
        ans[n-1]=0;
        s.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(s.size()!=0 && a[i]>=a[s.peek()]){
                s.pop();
            }
            if(s.size()==0)ans[i]=0;
            else ans[i] = s.peek()-i;
            s.push(i);
        }
        return ans;
    }
}