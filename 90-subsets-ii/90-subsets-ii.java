class Solution {
    public List<List<Integer>> subsetsWithDup(int[] a) {
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(a);
        
        solve(a,0,ans,new ArrayList<>());
        return ans;
   }
    public void solve(int a[],int start,List<List<Integer>> ans,List<Integer> temp){
        if(!ans.contains(new ArrayList<>(temp))){
            ans.add(new ArrayList<>(temp));
        }
        for(int i=start;i<a.length;i++){
            temp.add(a[i]);
            solve(a,i+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}