class Solution {
    public List<String> summaryRanges(int[] a) {
        List<String> ans = new ArrayList<String>();
        int n = a.length;
        if(n==0)return ans;
        int s=a[0],e=a[0];
        
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]==1){
                e++;
                continue;
            }
            else{
                String str = "";
                if(s==e){
                   ans.add(String.valueOf(s));
                }
                else{
                     str += (s+"->"+e);
                     ans.add(str);
                }
                s=a[i];
                e=a[i];
            }
            
        }
        if(s==e){
            ans.add(String.valueOf(s));
        }
        else{
            ans.add(String.valueOf(s+"->"+e));
         }
        return ans;
    }
}