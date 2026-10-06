class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int cur=nums[0];
        int maxDiff=-1;
        for(int i=1;i<n;i++){
            maxDiff=Math.max(maxDiff,nums[i]-cur);
            cur=Math.min(nums[i],cur);
        }
        return maxDiff==0?-1 :maxDiff;
        // while(i<n){
        //     if(nums[i]<cur){
        //         cur=nums[i];
        //         i++;
        //     }
        //     if(i<n && nums[i]>cur){
        //         diff=nums[i]-cur;
        //     }
        //     maxDiff=Math.max(diff,maxDiff);
        //     i++;
        // }
        // return maxDiff==Integer.MIN_VALUE?-1:maxDiff;
    }
}