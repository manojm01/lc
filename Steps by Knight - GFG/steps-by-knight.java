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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends


class Pair
{
    int x, y;
    
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}


class Solution
{
    
    private boolean isValid(int x, int y, int N)
    {
        if(x>=0 && y>=0 && x<N && y<N) return true;
        
        return false;
    }
    
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        
        if(Arrays.equals(KnightPos, TargetPos)) return 0;
        
        int steps = 0;
        Queue<Pair> queue = new ArrayDeque<>();
        
        queue.add(new Pair(KnightPos[0]-1, KnightPos[1]-1));
        
        int dx[] = {2, 2, 1, -1, -2, -2, -1, 1};
        int dy[] = {1, -1, -2, -2, 1, -1, 2, 2};
        
        
        boolean visited[][] = new boolean[N][N];
        
        while(!queue.isEmpty())
        {
            int n = queue.size();
            steps++;
            
            for(int j=0; j<n; j++)
            {
                Pair p = queue.poll();
                
                visited[p.x][p.y] = true;
                
                for(int i=0; i<8; i++)
                {
                    int x = p.x + dx[i];
                    int y = p.y + dy[i];
                    
                    if(x == TargetPos[0]-1 && y == TargetPos[1]-1) return steps;
                    
                    
                    if(isValid(x, y, N) && visited[x][y] == false)
                    {
                        visited[x][y] = true;
                        queue.offer(new Pair(x, y));
                    }
                }
                
            }
        }
        
        
        return -1;
        
    }
}



