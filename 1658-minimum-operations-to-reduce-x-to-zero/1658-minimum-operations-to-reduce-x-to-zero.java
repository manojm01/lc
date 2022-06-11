class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0, n=nums.length;
        for(int i:nums) total+=i;
        if(x>total) return -1;
        int left=0,right=0, curr=0, ans=-1;
        for(; right<n;right++){
            curr+=nums[right];
            while(curr>total-x&&left<=right){
                curr-=nums[left];
                left++;
            }
            if(curr==total-x) ans=Math.max(ans, right-left+1);
        }
        if(ans==-1) return ans;
        return n-ans;
    }
}