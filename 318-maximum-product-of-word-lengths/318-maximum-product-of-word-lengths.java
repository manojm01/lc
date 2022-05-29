class Solution {
    public int maxProduct(String[] w) {
        int ans = 0;
        for(int i=0;i<w.length;i++){
            for(int j=i+1;j<w.length;j++){
                if(check(w[i],w[j])){
                    ans = Math.max(ans,w[i].length()*w[j].length());
                }
            }
        }
        return ans;
    }
    public boolean check(String a,String b){
        for(char c:a.toCharArray()){
            if(b.indexOf(c)!=-1)return false;
        }
        return true;
    }
}