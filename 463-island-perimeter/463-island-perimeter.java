class Solution {
     
    public int islandPerimeter(int[][] g) {
        int ones=0;
       int min=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]==1){
                    ones++;
                    min += check(g,i,j);
                }
            }
        }
        // System.out.println(min);
        return (ones*4)-min;
    }
    public int check(int g[][],int i,int j){
        int min=0;
        if(i>0){
            if(g[i-1][j]==1)min++;
        }
        if(j>0){
            if(g[i][j-1]==1)min++;
        }
        if(i<g.length-1){
            if(g[i+1][j]==1)min++;
        }
        if(j<g[0].length-1){
            if(g[i][j+1]==1)min++;
        }
         // System.out.println(i+" "+j+" "+min);
        return min;
    }
}