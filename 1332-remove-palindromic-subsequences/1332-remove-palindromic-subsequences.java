class Solution {
    public int removePalindromeSub(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }else{
                return 2;
            }
        }
        return 1;
    }
}