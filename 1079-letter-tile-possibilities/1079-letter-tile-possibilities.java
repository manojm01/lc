class Solution {
    int ans = 0;
    Set<String> set = new HashSet<>();
    public int numTilePossibilities(String s) {
        ArrayList<String> l = new ArrayList<>();
      
        int n = s.length();
        subsequence(s,0,n,"",l);
        
        for(String c:l){
            perm(c,0,c.length()-1);
        }
            
        int x = set.size();
        set.clear();
        return x;
    }
    public void subsequence(String s,int i,int n,String curr, ArrayList<String> l){
        if(!l.contains(curr) && curr.length()!=0)
          l.add(curr);
        if(i>=n){
           return;
        }
        subsequence(s,i+1,n,curr+s.charAt(i),l);
        subsequence(s,i+1,n,curr,l);
        
    }
    public void perm(String s,int l,int r){
        if(l==r){
            // ans++;
            set.add(s);
        }
        else
        for(int i=l;i<=r;i++){
           s = swap(l,i,s);
           perm(s,l+1,r);
           s =swap(l,i,s);
        }
    }
    
    public String swap(int i, int j, String s){
        char c[] = s.toCharArray();
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
        
        return new String(c);
    }
}