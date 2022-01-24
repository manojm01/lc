class Solution {
    public boolean detectCapitalUse(String s) {
        int n = s.length();
        int allC=0,allS=0,f=0;
        
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c>='A'&&c<='Z')allC++;
            else if(c>='a'&&c<='z')allS++;
            if(c>='A'&&c<='Z')f++;
        }
        if(f==1 && s.charAt(0)>='A' && s.charAt(0)<='Z')return true;
        else if(allC==n || allS==n)return true;
        
        return false;
    }
}