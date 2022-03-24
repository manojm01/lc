// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        // code here
        int c[] = new int[26];
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch:s.toCharArray()){
            c[ch-'a']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<26;i++){
            if(c[i]!=0){
                pq.add(c[i]);
            }
        }
        while(k>0){
            int fr = pq.poll();
            fr--;
            k--;
            pq.add(fr);
        } 
        int ans = 0;
        
        while(!pq.isEmpty()){
            ans += pq.peek()*pq.poll();
        }
        return ans;
    }
}



