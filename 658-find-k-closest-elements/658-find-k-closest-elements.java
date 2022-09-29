class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        int n = a.length;
        List<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
                    
        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        
        for(int i=k;i<n;i++){
            int t = pq.peek();
            
            if(Math.abs(t-x)>Math.abs(x-a[i])){
                pq.poll();
                pq.add(a[i]);
            }
        }
        for(int i:pq)ans.add(i);
        Collections.sort(ans);
        return ans;
        
//         if(x<a[0]){
//             for(int i=0;i<k;i++)ans.add(a[i]);
//             return ans;
//         }
//         if(x>a[n-1]){
//             for(int i=n-k;i<=n-1;i++)ans.add(a[i]);
//             return ans;
//         }
//         int ind=0;
//         while(a[ind]!=x)ind++;
        
//         for()
    }
}