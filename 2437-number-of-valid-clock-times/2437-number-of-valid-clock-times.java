class Solution {
    public int countTime(String s) {
        int ans = 1;
        char c[] = s.toCharArray();
        
        if(c[0]=='?'){
            if(c[1]<'4')ans=3;
           
            else ans=2;
        }
        
        if(c[1]=='?'){
            if(c[0]=='?')ans=24;
            else if(c[0]=='2')ans*=4;
            else ans*=10;
        }
        if(c[3]=='?')ans*=6;
        if(c[4]=='?')ans*=10;
        
        return ans;
    }
}