class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int k=3;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%3!=1){
                if(nums[i]+1 %3!=1){
                    nums[i]=nums[i]-1;
                }
                nums[i]=nums[i]+1;
            }
            count+=Math.min(nums[i]%3, 3-(nums[i] % 3));
        }
        return count;
    }
}

