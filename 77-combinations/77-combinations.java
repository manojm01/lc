class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(1,n,k,new ArrayList<>(),ans);
        
        
        return ans;
    }
    public void solve(int x,int n,int k, List<Integer> l, List<List<Integer>> ans ){
       
        if(k==0){
            ans.add(new ArrayList<>(l));
            return;
        }
         for(int i=x;i<=n;i++){
             l.add(i);
            solve(i+1,n,k-1,l,ans);
             l.remove(l.size()-1);
        }
    }
}