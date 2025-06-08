class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length, i=0, j=0,len=n+1, sum=0;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
               if (j-i+1<len) {
                    len=j-i+1;
                }
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return len==n+1?0:len;
    }
}