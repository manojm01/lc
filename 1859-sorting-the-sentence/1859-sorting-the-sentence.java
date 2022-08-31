class Solution {
    public String sortSentence(String s) {
        String a[] = s.split(" ");
        String ans[] = new String[a.length];
        
        for(String str:a){
            int n = str.charAt(str.length()-1)-'0';
            ans[n-1]=str.substring(0,str.length()-1);
        }
        String x="";
        for(String str:ans){
            x+=str+" ";
        }
        return x.substring(0,x.length()-1);
    }
}