class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new  ArrayList<String>();
        fun(0,0,n,"",ans);
        return ans;
    }
    public void fun(int o,int c,int n,String s, List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
        }
        if(o<n)fun(o+1,c,n,s+'(',ans);
        if(c<o)fun(o,c+1,n,s+')',ans);
    }
    
}