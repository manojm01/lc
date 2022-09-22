class Solution {
   private static String ans="";
    public String reverseWords(String s) {
       String a[] = s.split(" ");
//          char c[] = s.toCharArray();
//          int n = s.length();
        
//         for(int i=0;i<n;i++){
//             int start=i;
//             int end=i;
//             while( end<n && c[end]!=' '){
//                 end++;
//                 i++;
//             }
//             String r = new String(s.substring(start,end));
//             reverse(r);
//         }
        
//         String fans=ans.substring(0,n);
            String ans="";
        for(int i=0;i<a.length;i++){
            a[i] = new StringBuilder(a[i]).reverse().toString();
            ans += a[i]+" ";
        }
        
        return ans.substring(0,ans.length()-1);
    }
    public static void reverse(String r){
        int n = r.length();
         char c[] = r.toCharArray();
        for(int i=0;i<n/2;i++){
            char t = c[i];
            c[i] = c[n-i-1];
            c[n-i-1]=t;
        }
        
        String rev = new String(c);
        ans += rev+" "; 
        
    }
}