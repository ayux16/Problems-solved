class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int len=n+1;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                len=Math.min(len,j-i+1);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        if(len==n+1) return 0;
        return len;
    }
}