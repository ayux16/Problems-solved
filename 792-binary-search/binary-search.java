class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int n=nums.length;
        int h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                h--;
            }
            else{
                l++;
            }
        }
        return -1;
    }
}