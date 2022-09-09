class Solution {
    public int numberOfWeakCharacters(int[][] aa) {
        int ans = 0;
        
        int max = 0;
        Arrays.sort(aa, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);
        for(int i[]:aa){
            if(i[1]<max){
                ans++;
            }
            max = Math.max(max,i[1]);
        }
        return ans;
    }
}