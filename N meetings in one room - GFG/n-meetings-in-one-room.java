// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        List<List<Integer>> l = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            List<Integer> t = new ArrayList<>();
            t.add(start[i]);
            t.add(end[i]);
            l.add(t);
        }
        Collections.sort(l,(a,b)->{
            if(a.get(1)==b.get(1)){
                return a.get(0)-b.get(0);
            }
            return a.get(1)-b.get(1);
        });
        // System.out.println(l);
        int i=0,j=1,ans=1;
        
        while(i<n&&j<n){
            if(l.get(i).get(1)<l.get(j).get(0)){
                ans++;
                i=j;
                j++;
            }
            else{
                j++;
            }
        }
        return ans;
    }
}
