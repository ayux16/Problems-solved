class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums,goal)-check(nums,goal-1);
    }
    public int check(int nums[],int goal){
        if(goal<0){
            return 0;
        }
        int l=0,c=0;
        int n=nums.length;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            c+=r-l+1;
        }
        return c;
    }
}