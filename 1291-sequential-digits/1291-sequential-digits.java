class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        
        int[] n = {12,23,34,45,56,67,78,89,
                   123,234,345,456,567,678,789,
                   1234,2345,3456,4567,5678,6789,
                   12345,23456,34567,45678,56789,
                   123456,234567,345678,456789,
                   1234567,2345678,3456789,
                   12345678,23456789,
                   123456789};
        
        for(int i=0;i<n.length;i++){
            if(n[i]<low)continue;
            if(n[i]>high)break;
            ans.add(n[i]);
        }
        return ans;
        
        
        // for(int i=low;i<=high;i++){
        //     if(check(i)){
        //         ans.add(i);
        //         int x = (int)(Math.log(i)/Math.log(10));
        //         i = i + (int)Math.pow(10,x);
        //     }
        // }
        // return ans;
    }
    // public boolean check(int n){
    //     String s = String.valueOf(n);
    //     int l = s.length();
    //     for(int i=0;i<l-1;i++){
    //         if(s.charAt(i)+1 != s.charAt(i+1))return false;
    //     }
    //     return true;
    // }
}