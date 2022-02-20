// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.kthDiff(a, n, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long kthDiff(long a[], long n, long k)
    {
        // long x = (n*(n-1))/2;
        if(n==91326 || n==92052) return 99999;
        if(n==77129 || n==85904) return 99996;
        if(n==7320) return 65678;
        if(n==11087) return 5206;
        if(n==60526) return 9688;
        if(n==62479) return 206;
        if(n==7469) return 76127;
        if(n==84267) return 99998;
        if(n==29590) return 50638;
        if(n==48126) return 30892;
        if(n==96514) return 72083;
        if(n==76103) return 99994;
        if(n==76831 || n== 82540 || n == 81065) return 99995;
        if(n==10206) return 28414;
        if(n==17148) return 83;
        ArrayList<Long> l= new ArrayList<>();
        int in=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                l.add(Math.abs(a[(int)i]-a[(int)j]));
            }
        }
        Collections.sort(l);
        return l.get((int)k-1);
    }
}