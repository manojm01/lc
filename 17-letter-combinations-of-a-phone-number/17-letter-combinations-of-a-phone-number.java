class Solution {
    public List<String> letterCombinations(String digits) {
       if(digits.length()==0){
            List<String> t = new ArrayList<>();
            return t;
        }
        return solve(digits);
       
    }
    public List<String> solve(String digits){
         List<String> ans = new ArrayList<>();
        String a[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0){
            List<String> t = new ArrayList<>();
            t.add("");
            return t;
        }
        char ch = digits.charAt(0);
        String rest = digits.substring(1);
        
        List<String> rem = solve(rest);
        
        String codeForDigit =  a[ch-'0'];
        
        for(int i=0;i<codeForDigit.length();i++){
            char chCode = codeForDigit.charAt(i);
            for(String str:rem){
                ans.add(chCode + str);
            }
        }
        return ans;
    }
}