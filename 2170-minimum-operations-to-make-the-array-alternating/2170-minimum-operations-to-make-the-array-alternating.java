class Solution {
    public int minimumOperations(int[] a) {
        int ans = 0;
        int n = a.length;
        HashMap<Integer,Integer> emap = new HashMap<>();
        HashMap<Integer,Integer> omap = new HashMap<>();
        
        
        // int esum=0,osum=0;
        // int emax=0,omax=0;
        int emaxele=0,omaxele=0;
        
        for(int i=0;i<n;i++){
           if(i%2==0){
               emap.put(a[i],emap.getOrDefault(a[i],0)+1);
           }else{
               omap.put(a[i],omap.getOrDefault(a[i],0)+1);
           }
        }
        for(int i:omap.keySet()){
           if(emap.containsKey(i)){
               if(emap.get(i)>omap.get(i))omap.put(i,-1);
               else emap.put(i,-1);
           }
        }
         for(int i:emap.keySet()){
           emaxele = Math.max(emaxele,emap.get(i));
        }
         for(int i:omap.keySet()){
           omaxele = Math.max(omaxele,omap.get(i));
        }
        // System.out.println("eele "+(emaxele));
        // System.out.println("oele "+(omaxele));
         int fix  = emaxele+omaxele;
         ans = n-fix;
       return ans; 
    }
}