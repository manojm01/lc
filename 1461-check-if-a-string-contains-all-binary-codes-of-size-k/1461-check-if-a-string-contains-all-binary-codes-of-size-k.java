class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> h = new HashSet<>();
        int n = s.length();
        for(int i=0;i<n-k+1;i++){
            h.add(s.substring(i,i+k));
        }
        return h.size()==(int)Math.pow(2,k);
    }
}