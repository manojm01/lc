class Solution {
    public String reverseWords(String s) {
        s = s.trim();
         String a[] = s.split(" +");
        String ans = "";
        for(int i=a.length-1;i>=0;i--){
            ans += a[i]+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
}