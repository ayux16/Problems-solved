class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int first=findFirst(nums,target,low,high);
        int last=findLast(nums,target,low,high);
        if(first!=-1 && last!=-1){
            return new int[]{first,last};
        }
        return new int[]{-1,-1};
    }
    public int findFirst(int nums[],int target, int low, int high){
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int findLast(int nums[],int target, int low, int high){
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}