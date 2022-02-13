class Solution {
    public int[] canSeePersonsCount(int[] a) {
        int n = a.length;
        int ans [] = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                ans[s.pop()]++;
            }
            if(!s.isEmpty()){
                ans[s.peek()]++;
            }
            s.push(i);
        }
        return ans;
    }
}