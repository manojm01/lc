// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int a[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> l = new ArrayList<Integer>();
        int rb=0,re=r-1,cb=0,ce=c-1;
        
        while(rb<=re && cb<=ce){
            for(int i=cb;i<=ce;i++){
                l.add(a[rb][i]);
            }
            rb++;
            for(int i=rb;i<=re;i++){
                l.add(a[i][ce]);
            }
            ce--;
            if(rb<=re)
            for(int i=ce;i>=cb;i--){
                l.add(a[re][i]);
            }
            re--;
            if(cb<=ce)
            for(int i=re;i>=rb;i--){
                l.add(a[i][cb]);
            }
            cb++;
        }
        return l;
    }
}
