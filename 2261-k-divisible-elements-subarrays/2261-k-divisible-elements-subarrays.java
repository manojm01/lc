class Solution {
    public int countDistinct(int[] a, int k, int p) {
        
        Set<String> set = new HashSet<>();
        int n = a.length;
        for(int i=0;i<n;i++){
            int cnt = 0;
            StringBuilder str = new StringBuilder();
            for(int j=i;j<n;j++){
                str.append(a[j]+"-");
                if(a[j]%p==0){
                    cnt++;
                }
                if(cnt<=k){
                    set.add(str.toString());
                }
                else{
                    break;
                }
            }
            
        }
        // System.out.println(set);
        return set.size();
        
    }
}