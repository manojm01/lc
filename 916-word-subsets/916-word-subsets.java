class Solution {
    public List<String> wordSubsets(String[] w1, String[] w2) {
        List<String> ans = new ArrayList<String>();
         int bmax[] = count("");
        
        for(String t:w2){
            int bcnt[] = count(t);
            for(int i=0;i<26;i++){
                bmax[i] = Math.max(bmax[i],bcnt[i]);
            }
        }
        for(String s:w1){
            int acnt[] = count(s);
            int i = 0;
            
            for(i=0;i<26;i++){
                if(acnt[i]<bmax[i])break;
            }
            
            if(i==26)ans.add(s);
        }
        return ans;
    }
    public int[] count(String s){
          int a[] = new int[26];
         for(char c:s.toCharArray()){
            a[c-'a']++;
         }
         return a;
     }
//     public boolean check(String s,String t){
//         int a[] = new int[26];
//         int b[] = new int[26];
        
//         for(char c:s.toCharArray()){
//             a[c-'a']++;
//         }
//         for(char c:t.toCharArray()){
//             b[c-'a']++;
//         }
//         for(int i=0;i<26;i++){
//             if(b[i]!=0){
//                 if(a[i]<b[i])return false;
//             }
//         }
//         return true;
//     }
}