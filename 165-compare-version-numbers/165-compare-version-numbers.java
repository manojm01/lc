class Solution {
    public int compareVersion(String s1, String s2) {
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        int i=0,j=0;
        int a=0,b=0,c=0;
        while(i<s1.length() || j<s2.length()){
             a=0;b=0;c=0;
            
            while(i<s1.length() && c1[i]!='.'){
                 c = c*10+(c1[i]-'0'); 
                 i++;
            }
            a+=c;
            c=0;
            while(j<s2.length() && c2[j]!='.'){
                 c = c*10+(c2[j]-'0'); 
                 j++;
            }
            b+=c;
            
            if(a<b)return -1;
            else if(a>b)return 1;
             
            i++;j++;
           
        }
        return 0;
    }
}