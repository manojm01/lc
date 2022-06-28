class Solution {
    public int minDeletions(String s) {
        int f[] = new int[26];
        char ch[] = s.toCharArray();
        
        for(char c:ch){
            f[c-'a']++;
        }
        HashSet<Integer> fr = new HashSet<>();
        int ans=0;
        for(int i=0;i<26;i++){
            while(f[i]>0 && fr.contains(f[i])){
                f[i]--;
                ans++;
            }
            fr.add(f[i]);
        }
        
        return ans;
    }
}