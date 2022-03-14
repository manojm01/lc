class Solution {
    public String simplifyPath(String s) {
        String str[] = s.split("/");
        
        Stack<String> st = new Stack<>();
        
        for(String p:str){
            if(p.equals(".")||p.equals("")){
                continue;
            }
            if(p.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
                else continue;
            }
            else
              st.add(p);
        }
        return "/"+String.join("/",st);
    }
}  