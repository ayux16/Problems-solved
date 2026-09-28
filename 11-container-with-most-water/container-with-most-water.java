class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int n=nums.length;
        int j=n-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int w=j-i;
            if(nums[i]<nums[j]){
                ans=Math.max(w*nums[i],ans);
                i++;
            }
            else{
                ans=Math.max(w*nums[j],ans);
                j--;
            }
        }
        return ans;
    }
}