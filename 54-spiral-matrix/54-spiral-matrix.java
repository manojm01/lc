class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> ans = new ArrayList<Integer>();
        int rb=0,re=a.length-1,cb=0,ce=a[0].length-1;
        
        while(rb<=re && cb<=ce){
            for(int i=cb;i<=ce;i++){   // right
                ans.add(a[rb][i]);
            }
            rb++;
            for(int i=rb;i<=re;i++){   //down
                ans.add(a[i][ce]);
            }
            ce--;
            
            if(rb<=re){                 //left
                for(int i=ce;i>=cb;i--){
                    ans.add(a[re][i]);
                }
            }
            re--;
            if(cb<=ce){             // top
                for(int i=re;i>=rb;i--){
                    ans.add(a[i][cb]);
                }
            }
            cb++;
        }
        
        return ans;
    }
}