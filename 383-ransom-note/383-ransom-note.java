class Solution {
    public boolean canConstruct(String r, String m) {
        int n = m.length();
        int a[] = new int[26];
        
        for(char c:m.toCharArray()){
            a[c-'a']++;
        }
        for(char c:r.toCharArray()){
            a[c-'a']--;
        }
        for(int i:a){
            if(i<0)return false;
        }
        return true;
    }
}