class Solution {
    public int uniqueMorseRepresentations(String[] w) {
        Set<String> s = new HashSet<>();
        
        String arr[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String str:w){
            String x = "";
            char c[] = str.toCharArray();
            for(char ch:c){
                x += arr[ch-'a'];
            }
            s.add(x);
        }
        return s.size();
    }
}