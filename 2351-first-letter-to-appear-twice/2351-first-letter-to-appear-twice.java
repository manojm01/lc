class Solution {
    public char repeatedCharacter(String s) {
        
        for(int i=0;i<s.length();i++){
            if(s.substring(0,i).indexOf(s.charAt(i))!=-1){
                return s.charAt(i);
            }
        }
        return s.charAt(s.length()-1);
    }
}