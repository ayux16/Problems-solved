class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int len=Integer.MAX_VALUE;
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
        if(len==Integer.MAX_VALUE) return 0;
        return len;
    }
}