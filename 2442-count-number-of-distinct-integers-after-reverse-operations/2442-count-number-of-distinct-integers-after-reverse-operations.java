class Solution {
    public int countDistinctIntegers(int[] a) {
        Set<Integer> s = new HashSet<>();
        
        for(int i:a){
            s.add(i);s.add(fun(i));
        }
        return s.size();
    }
    public int fun(int n){
        int x=0;
        
        while(n>0){
            x = x*10 + n%10;
            n/=10;
        }
        return x;
    }
}