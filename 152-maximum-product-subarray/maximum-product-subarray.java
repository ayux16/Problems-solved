class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int curMax=nums[0];
        int curMin=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int t=curMax;
                curMax=curMin;
                curMin=t;
            }
            curMax=Math.max(nums[i],nums[i]*curMax);
            curMin=Math.min(nums[i],nums[i]*curMin);

            if(ans<curMax){
                ans=curMax;
            }
        }
        return ans;
    }
}