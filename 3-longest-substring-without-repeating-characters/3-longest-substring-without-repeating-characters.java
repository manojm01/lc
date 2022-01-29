class Solution {
    public int lengthOfLongestSubstring(String s) {
          HashMap<Character,Integer> h = new HashMap<>();
          int n = s.length();
          if(n==0)return 0;
	      int maxl = 0;
	      char a[] = s.toCharArray();
          int start = 0;
         
          for(int i=0;i<n;i++){
              if(h.containsKey(a[i])){
                  start = Math.max(start,h.get(a[i])+1);
              }
              maxl = Math.max(maxl,i+1-start);
              h.put(a[i],i);
          }
           maxl = Math.max(maxl,n-start);   
          return maxl;
    }
}