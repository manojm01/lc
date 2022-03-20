// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        Solution obj = new Solution();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String A = read.readLine().trim();
            
            String ans = obj.chooseandswap(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    
    
    String chooseandswap(String s){
        // Code Here
       int n = s.length();
        char c[] = s.toCharArray();
    
        SortedSet<Character> set = new TreeSet<>();
        for(char ch:c){
            set.add(ch);
        }
    
        for(int i=0;i<n && set.size()!=1;i++){
           char ch = s.charAt(i);
           set.remove(ch);
           if(set.first()<ch){
               s = s.replaceAll(ch+"","}");
            //   System.out.println("1: "+s);
               s = s.replaceAll(set.first()+"",ch+"");
            //   System.out.println("2: "+s);
               s = s.replaceAll("}",set.first()+"");
            //   System.out.println("3: "+s);
               break;
           }
        }
   
        return s;
    }
    
}