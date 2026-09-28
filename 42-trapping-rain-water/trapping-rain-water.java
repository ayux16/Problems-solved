class Solution {
    public int trap(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        int maxL=Integer.MIN_VALUE;
        int maxR=Integer.MIN_VALUE;
        int water=0;
        while(i<j){
            maxL=Math.max(maxL,nums[i]);
            maxR=Math.max(maxR,nums[j]);
            if(maxL<maxR){
                water+=maxL-nums[i];
                i++;
            }
            else{
                water+=maxR-nums[j];
                j--;
            }
        }
        return water;
    }
}