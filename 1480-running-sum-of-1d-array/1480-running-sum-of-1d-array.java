class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] a = new int[nums.length];
        
        a[0] = nums[0];
        for(int i=1 ;i<nums.length;i++){
            a[i] = nums[i] + a[i-1];
        }
        return a;
    }
}