class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        boolean flag = true;
        int m = part.length();
        
        StringBuilder sb = new StringBuilder(s);
        while(true){
            int i = sb.indexOf(part);
            
           if(i==-1)break;
            sb = sb.replace(i,i+m,"");
            i++;
        }
        return sb.toString();
    }
}
