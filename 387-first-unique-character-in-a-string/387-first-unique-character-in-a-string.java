class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        
        for(int i=0;i<s.length();i++){
            
            String pre = s.substring(0,i);
            String post = s.substring(i+1,s.length());
            
           if( pre.indexOf(s.charAt(i))==-1 &&  post.indexOf(s.charAt(i))==-1 ){
               ans=i;
               break;
           } 
        }
        
        return ans;
    }
}