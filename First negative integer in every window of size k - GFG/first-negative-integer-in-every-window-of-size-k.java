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
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long a[], int n, int k)
    {
        Queue<Long> q = new LinkedList<>();
        long ans[] = new long[n-k+1];
        int index = 0;
        for(int i=0;i<n;i++){
            if(i<k-1){
                if(a[i]<0)q.add(a[i]);
            }
            else{
                if(a[i]<0)q.add(a[i]);
                
                if(!q.isEmpty()){
                    if(q.peek()==a[index]){
                        ans[index] = q.poll();
                    }else{
                        ans[index] = q.peek();
                    }
                }
                else{
                    a[index] = 0;
                }
                index++;
            }
        }
        return ans;
        
        
        
        
        
        
        // long ans[] = new long[n-k+1];
        
        // int index=0;
        // for(int i=0;i<n-k+1;i++){
        //     boolean f=false;
        //     for(int j=0;j<k;j++){
                
        //         if(a[i+j]<0){
        //             f=true;
        //             ans[index]=a[i+j];
        //             index++;
        //             break;   
        //         }
        //     }
        //     if(f==false){
        //          ans[index]=0;
        //          index++;
        //     }
       
        // }
        // return ans;
    }
}