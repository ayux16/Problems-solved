class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int n=nums.length,j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<n){
            nums[j++]=0;
        }
    }
}