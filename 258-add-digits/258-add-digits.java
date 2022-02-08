class Solution {
    public int addDigits(int n) {
        int ans = 0;
        while(n>=10){
            int x = n;
            ans = 0;
            while(x>0){
               ans +=  x%10;
               x /= 10;
            }
            n = ans;
        }
        return n;
    }
}