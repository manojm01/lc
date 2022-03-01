class Solution {
    public int[][] floodFill(int[][] img, int sr, int sc, int newColor) {
        if(img[sr][sc]!=newColor){
            dfs(img,sr,sc,img[sr][sc],newColor);
        }
        return img;
    }
    void dfs(int[][] img, int i, int j, int c1,int c2){
        
        if(i<0||j<0||i>=img.length||j>=img[0].length||img[i][j]!=c1)return;
        img[i][j]=c2;
        dfs(img,i,j-1,c1,c2);
        dfs(img,i,j+1,c1,c2);
        dfs(img,i-1,j,c1,c2);
        dfs(img,i+1,j,c1,c2);
    }
}