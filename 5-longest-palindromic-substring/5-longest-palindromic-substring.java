class Solution {
    int low=0,maxLen=0;
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1)return s;
        
        for(int i=0;i<n-1;i++){
            check(s,i,i);
            check(s,i,i+1);
        }
        
        return s.substring(low,low+maxLen);
    }
    public void check(String s,int j,int k){
       while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
           j--;k++;
       }
        if(maxLen<k-j-1){
            maxLen = k-j-1;
            low = j+1;
        }
    }
}