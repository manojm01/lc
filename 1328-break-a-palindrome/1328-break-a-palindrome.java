class Solution {
    public String breakPalindrome(String s) {
        char c[] = s.toCharArray();
        int n = s.length();
        
        if(n==1)return "";
     
        int i=0;
        for(i=0;i<n/2;i++){
            if(c[i]!='a'){
                c[i]='a';
               return new String(c);
            }
        }
        c[n-1]='b';
        
        return new String(c);
    }
}