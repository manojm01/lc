class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        String ans = "";
        if(n<m)return "";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();   // for string t
        
        
        int reqcnt = t.length();   // 
        int cnt = 0;
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int i=-1,j=-1;
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            //add
           while(i<s.length()-1 && cnt<reqcnt){
               i++;
               char ch = s.charAt(i);
               map1.put(ch,map1.getOrDefault(ch,0)+1);
               
               if(map1.get(ch)<= map2.getOrDefault(ch,0)){
                    cnt++; 
               }
               f1=true;
           }// ans is found
             
            //try to minimize length of valid ans
            // collect ans and release 
            while(j<i && cnt==reqcnt){
                String pans = s.substring(j+1,i+1);  // potential answer
                
                if(ans.length()==0 || pans.length()<ans.length()){
                    ans = pans;   // ans collected
                }
                j++;
                char ch = s.charAt(j);
                
                if(map1.get(ch)==1){
                    map1.remove(ch);
                }else{
                    map1.put(ch,map1.get(ch)-1);
                }
                
                if(map1.getOrDefault(ch,0) < map2.getOrDefault(ch,0)){
                    cnt--;
                }
                  f2=true;
            }
            
            if(f1==false && f2==false)break;
        }
        return ans;
    }
  
}