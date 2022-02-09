class Solution {
    public boolean wordBreak(String s, List<String> wordDict){
        int n = s.length();
        Set<String> set = new HashSet<>(wordDict);
        
        boolean t[] = new boolean[n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(set.contains(s.substring(j,i+1)) && (j==0 || t[j-1]==true)){
                    t[i] = true;
                }
            }
        }
        
        return t[n-1];
        
    }
}