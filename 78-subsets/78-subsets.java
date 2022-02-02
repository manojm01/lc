class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        int start=0;
        addList(a,start,ans, new ArrayList<>());
        return ans;
    }
    public void addList(int a[], int start, List<List<Integer>> ans,List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int i=start;i<a.length;i++){
            temp.add(a[i]);
            addList(a,i+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}