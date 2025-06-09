class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,n=nums.length;
        int sum=0,ans=n+1;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                ans=Math.min(ans,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return ans==n+1?0:ans;
    }
}