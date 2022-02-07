class Solution {
    public char findTheDifference(String s, String t) {
        int c = (int)t.charAt(s.length());
        for(int i=0;i<s.length();i++){
            c += (int)t.charAt(i);
            c -= (int)s.charAt(i);
        }
        return (char)c;
    }
}