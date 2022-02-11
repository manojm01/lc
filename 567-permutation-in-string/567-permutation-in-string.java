class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int c=0; 
        int ans = 0;
        int i=0,j=n;
        while(j<=m){
            String t = s2.substring(i,j);
            i++;j++; 
            if(check(t,s1))return true;
        }
        return false;
    }
    
    public boolean check(String t, String s2){
        int arr[] = new int[26];
      
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0)return false;
        }
        return true;
    }
}