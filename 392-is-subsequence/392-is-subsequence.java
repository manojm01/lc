class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        if(s.length()==0)return true;
        for(int i=0;i<t.length()&&j<s.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
        }
        return j==s.length();
       
    }
}