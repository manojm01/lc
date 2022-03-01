// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            int numbers[]= new int[N];
            for(int i = 0; i < N; i++)
                numbers[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.countPairs(N, X, numbers); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long countPairs(int n, int x, int a[]) 
    { 
        // code here
        int ans = 0;
        String ch = String.valueOf(x);
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i:a){
            String s = ""+i;
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        for(String s:map.keySet()){
            int freq = map.get(s);
            if(ch.startsWith(s)){
                String rem = ch.substring(s.length());
                if(map.containsKey(rem)){
                   if(rem.equals(s)){
                       freq--;
                   }
                   ans += map.get(rem)*freq;
                }
            }
          
        }
        return ans;
    }
} 