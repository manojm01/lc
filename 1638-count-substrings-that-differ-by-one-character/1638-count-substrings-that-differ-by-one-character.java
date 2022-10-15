class Solution {
    public int countSubstrings(String s, String t) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                int x = i;
                int y = j;
                int temp = 0;
                while( x<s.length() && y<t.length() ){
                    if(s.charAt(x)!=t.charAt(y)){
                        temp++;
                    }
                    if(temp==1){
                        ans += 1;
                    }
                    if(temp>=2){
                        break;
                    }
                    x++;
                    y++;
                }
            }
        }
        return ans;
    }
//     public boolean fun(String s, String t){
//         int a[] = new int[26];
        
//         for(char c:s.toCharArray())a[c-'a']++;
//         for(char c:t.toCharArray()){
//           if(a[c-'a']==0)a[c-'a']++;
//           else a[c-'a']--;
//         }
        
//         int n=0;int tot=0;
//         for(int i:a){
//             if(i!=0)n++;
//             tot+=i;
//         }
//          // System.out.println(s+"-"+t+"="+n);
        
//         if((n==1 || n==2)&& n==tot)return true;
        
//         return false;
//     }
}