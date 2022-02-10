class Solution {
    public String kthLargestNumber(String[] a, int k) {
        int n = a.length;
        Arrays.sort(a, (p,q)->{
                if(p.length()==q.length()){
                    return p.compareTo(q);
                }
                return p.length()-q.length();
            });

        return a[n-k];
    }
}