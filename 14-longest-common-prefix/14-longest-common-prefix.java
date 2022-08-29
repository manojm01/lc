class Solution {
    public String longestCommonPrefix(String[] a) {
        String ans = a[0];
        Arrays.sort(a);
        String first = a[0];
        String last = a[a.length-1];
        int c=0;
        
        while(c<first.length()){
            if(first.charAt(c)==last.charAt(c))c++;
            else break;
        }
        return c==0?"":first.substring(0,c);
    }
}