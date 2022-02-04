// { Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

class Main
{
    static Node buildTree(String str)
    {
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static void main (String[] args) throws IOException
    {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t-- > 0)
        {
            int k=Integer.parseInt(br.readLine());
            
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution g = new Solution();
            ArrayList<Integer> nodes = g.btWithKleaves(root,k);
            for(int i = 0;i<nodes.size();i++){
                System.out.print(nodes.get(i)+ " ");
            }
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/

class Solution
{ArrayList<Integer> l =new ArrayList<Integer>();
    public ArrayList<Integer> btWithKleaves(Node root, int k)
    {
        //add code here.
        l.clear();
        if(root==null)return l;
        solve(root,k);
        if(l.size()==0)l.add(-1);
        return l;
    }
   
    int solve(Node root, int k){
        if(root==null)return 0;
        int c = 0;
        if(root.right==null && root.left==null){
            c++;
        }
        c += solve(root.left,k);
        c += solve(root.right,k);
        
        if(c==k && (root.left!=null || root.right!=null)){
            l.add(root.data);
        }
        
        return c;
    }
}