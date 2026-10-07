class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int cur=nums[0];
        int maxSum=cur;
        int sum=cur;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
                 maxSum=Math.max(maxSum,sum);
            }
           
            else{
                sum=nums[i];
            }
        }
        return maxSum;
    }
}