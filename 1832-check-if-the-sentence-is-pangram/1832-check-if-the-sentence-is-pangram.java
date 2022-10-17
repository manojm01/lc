class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>s=new HashSet<>();
        
        char c[] = sentence.toCharArray();
        
        for(char i:c){
            s.add(i);
        }
        if(s.size()==26)return true;
        return false;
        
    
    }
}