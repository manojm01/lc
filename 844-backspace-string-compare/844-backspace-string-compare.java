class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for(char c:s.toCharArray()){
            
                 if(a.length()!=0 && c=='#'){
                     a.deleteCharAt(a.length()-1);
                 }
                else if(c!='#'){
                    a.append(c);
                }
            
        }
         for(char c:t.toCharArray()){
           
                 if(b.length()!=0 && c=='#'){
                     b.deleteCharAt(b.length()-1);
                 }
                else if(c!='#'){
                    b.append(c);
                }
            
        }
        return a.toString().equals(b.toString());
    }
}