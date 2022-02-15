// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String s)
    {
        // code here
        int n = s.length();
        char c[] = s.toCharArray();
       
        int a[] = new int[26];
        Queue<Character> q= new LinkedList<>();
        
        String ans = "";
        //  a[c[0]-'a']++;
        //  q.add(c[0]);
         
        for(int i=0;i<n;i++){
            a[c[i]-'a']++;
            if(a[c[i]-'a']==1){
                q.add(c[i]);
            }
            while(!q.isEmpty() && a[q.peek()-'a']!=1){
                q.remove();
            }
            if(q.isEmpty())ans +='#';
            else ans += q.peek();
        }
        return ans;
    }
}