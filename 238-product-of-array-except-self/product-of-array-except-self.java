class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pf[]=new int[nums.length];
        pf[0]=1;
        for(int i=1;i<nums.length;i++){
            pf[i]=nums[i-1]*pf[i-1];
        }
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){
            pf[i]=pf[i]*postfix;
            postfix=postfix*nums[i];
        }
        return pf;
    }
}