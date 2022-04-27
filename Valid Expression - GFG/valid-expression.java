// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String S = sc.nextLine().trim();
            Solution ob = new Solution();
            if(ob.valid(S))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character> st = new Stack<>();
        char c[] = s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            if(c[i]=='(')st.push(')');
            else if(c[i]=='[')st.push(']');
            else if(c[i]=='{')st.push('}');
            else
            {   if(st.isEmpty())return false;
                if(c[i]!=st.pop()){
                 return false;
                }
            }
        }
        return st.isEmpty();
    }
} 