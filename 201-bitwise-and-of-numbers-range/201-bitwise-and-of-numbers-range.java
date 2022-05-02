class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // for(int i=left;i<=right;i++){
        //     left &= i;
        // }
        while(right>left){
            right = right & (right-1);
        }
        
        return left&right;
    }
}