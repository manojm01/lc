class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        List<String> ans = new ArrayList<String>();
        for(String a:q)
            for(String b:d)
                if(check(a,b)){
                    ans.add(a);break;
                }
        return ans;
    }
    public boolean check(String a,String b){
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i))c++;
            if(c>2)return false;
        }
        return true;
    }
}