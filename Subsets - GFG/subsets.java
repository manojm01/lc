// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        A.add(arr[i]);
		        
		    }
		   
		   
		    
		    ArrayList <ArrayList<Integer>> res = new Solution().subsets(A);
		    for (int i = 0; i < res.size (); i++)
		    {
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		          System.out.print(res.get(i).get(j)+" ");
		        }
		        System.out.println();
		      
		    }
		    //System.out.println();
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a)
    {
        //code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        ArrayList<Integer> t = new ArrayList<Integer>();
        solve(0,t,a,ans);
        Collections.sort(ans,new fun());
        return ans;
    }
    static class fun implements Comparator<ArrayList<Integer>>{
        public int compare(ArrayList<Integer>a,ArrayList<Integer>b){
            
            for(int i=0;i<Math.min(a.size(),b.size());i++){
                if(a.get(i)>b.get(i))return 1;
                else if(a.get(i)<b.get(i))return -1;
            }
            return a.size()-b.size();
        }
    }
    public static void solve(int index, ArrayList<Integer> t,ArrayList<Integer> a,ArrayList<ArrayList<Integer>> ans){
        if(index==a.size()){
            ans.add(new ArrayList<>(t));
            return;
        }
        solve(index+1,t,a,ans);
        t.add(a.get(index));
        solve(index+1,t,a,ans);
        t.remove(t.size()-1);
    }
}