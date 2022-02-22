class Solution {
    public String convertToTitle(int n) {
        String ans = "";
        int x = n;
        
        while(x>0){
            x--;
            char c = (char)('A'+(x%26));
            ans = c+ans;
            x = x/26;
        }
        
        return ans;
    }
}