class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = a.length;
        Arrays.sort(a);
    
        for(int i=0;i<n;i++){
            if(i>0 && a[i]==a[i-1])continue;
            
            int j=i+1;int k=n-1;
            
            while(j<k){
                if(a[i]+a[j]+a[k]>0){
                    k--;
                }
                else if(a[i]+a[j]+a[k]<0){
                    j++;
                }
                else if(a[i]+a[j]+a[k]==0){
                    ans.add(Arrays.asList(a[i],a[j],a[k]));
                    j++;
                    k--;
                  
                    while(j<k && a[j-1]==a[j])j++;
                }
                
            }
        }
        return ans;
    }
}