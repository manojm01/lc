class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        char c[] = s.toCharArray();
        int ans = 0;
        int n = s.length();
        for(int i=0;i<=n-k;i++){
            String str = s.substring(i,i+k);
            int x = Integer.parseInt(str);
            if(x!=0 && num%x==0){
                ans++;
            }
        }
        return ans;
    }
}