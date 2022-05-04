class Solution {
    public int maxOperations(int[] a, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        
        for(int i:a){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int i:a){
            if(h.get(i)>0 && h.get(k-i)!=null && h.get(k-i)>0){
                if(i==k-i && h.get(i)<2){
                   c--;
                }
                c++;
                // System.out.println("i: "+i);
                h.put(i,h.get(i)-1);
                h.put(k-i,h.get(k-i)-1);
            }
        }
        return c;
    }
}