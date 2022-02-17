class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
           List<List<Integer>> ans = new ArrayList<>();
           List<Integer> l = new ArrayList<>();
           int index=0;
           solve(index,c,t,ans,new ArrayList<>());
        return ans;
    }
    public static void solve(int index,int c[],int t,List<List<Integer>> ans,List<Integer> l){
        
        if(index == c.length){
            if(t==0)
              ans.add(new ArrayList<>(l));
            return;
        }
        
        if(c[index]<=t){
            l.add(c[index]);
            solve(index,c,t-c[index],ans,l);
            l.remove(l.size()-1);
        }
        solve(index+1,c,t,ans,l);
    }
}