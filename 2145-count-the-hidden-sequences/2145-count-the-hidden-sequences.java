class Solution {
    public int numberOfArrays(int[] a, int l, int u) {
        int s =0 ;
        long max=0;
        long min=0;
        long currm = 0;
        long curr=0;
        
        for(int i:a){
            curr += i;
            currm += i;
            
             max = Math.max(curr,max);
            min = Math.min(currm,min);
        }
        System.out.println(min+" "+max);
        long start = (long)l-min;
        long ans = 0;
        
        while(start+max<=u){
            ans++;
            start++;
        }
        
        return (int)ans;
            
    }
}