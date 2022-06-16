class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
//         for(int i:nums){
//             if(m.contains(i)){
                
//             }
//         }
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            if(!ans.contains(nums[i]))
            for(int j=i;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
                if(cnt>n/3 && !ans.contains(nums[i])){
                    ans.add(nums[i]);
                }
            }
        }
        return ans;
    }
}