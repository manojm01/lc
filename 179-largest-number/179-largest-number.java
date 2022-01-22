class Solution {
    public String largestNumber(int[] a) {
        int n = a.length;
        String s[] = new String[n];
        String ans = "";
        for(int i=0;i<n;i++){
            s[i] = String.valueOf(a[i]);
        }
        Arrays.sort(s,(p,q)->{
            String x = p+q;
            String y = q+p;
            return y.compareTo(x);
        });
        
        for(String i:s){
            ans += i;
        }
        if(ans.charAt(0)=='0')return "0";
        return ans;
    }
}