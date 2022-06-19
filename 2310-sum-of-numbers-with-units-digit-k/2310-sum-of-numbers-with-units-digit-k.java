class Solution {
    public int minimumNumbers(int num, int k) {
        
        int i=1;
        int ans = Integer.MAX_VALUE;
        if(num==0)return 0;
        if(k==0 && num%10!=0)return -1;
        while(k*i<=num){
            if((num - k*i) % 10 == 0){
                return i;
            }
            i++;
        }
        if(ans == Integer.MAX_VALUE)return -1;
        return ans;
        
 
//         if(num==0)return 0;
//         if((k%2==0 && num%2==1) || (k%10==0 && num%10!=0) || (k%5==0 && num%5!=0))return -1;
//             if(num==10 && k==0)return 1;
//          if(num<k)return -1;
//         if(num==k)return 1;
        
//         ArrayList<Integer> l = new ArrayList<>();
//         ArrayList<Integer> ls = new ArrayList<>();
//         HashMap<Integer,Integer> h = new HashMap<>();
//         h.put(0,-1);
//         int j=0;
//         int x=k;
//         while(x<=num){
//             l.add(x);
//             x+=10; 
//         }
//         x=k;
//         int ans = l.size();
//         int n = l.size();
//         int sum=0;
//         ls.add(x);
//         h.put(x,0);
        
//         for(int i=1;i<n;i++){
//             ls.add(l.get(i)+ls.get(i-1));
//             h.put(ls.get(i),i);
//         }
//         boolean f=false;
//         for(int i=0;i<n;i++){
//             if(l.contains(num-l.get(i)))return 2;
//             if(h.containsKey(ls.get(i)-num)){
//                 f=true;
//                 ans = Math.min(ans,i-h.get(ls.get(i)-num));
//             }
//         }
//         System.out.println(l);
//         System.out.println(ls);
//         System.out.println(h);
        
//         if(!f && ans==1)ans = -1;
//         if(!f && num%k==0)
//           ans = num/k;
//         return ans;
    }
}