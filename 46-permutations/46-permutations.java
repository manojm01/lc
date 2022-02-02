class Solution {
    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(a,ans,new ArrayList<>());
        
        return ans;
        
    }
     public static void solve(int a[], List<List<Integer>> ans,List<Integer> temp){
        if(temp.size()==a.length)
          ans.add(new ArrayList<>(temp));
          else {

            for(int i=0;i<a.length;i++){
                if(temp.contains(a[i]))continue;
                temp.add(a[i]);
                // System.out.println("temp "+i+" :"+temp);
                solve(a,ans,temp);
                // System.out.println("removed "+i+" :"+a[i]);
                temp.remove(temp.size()-1);
            }
          }
    }
}