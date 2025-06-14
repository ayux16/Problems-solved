class Solution {
    public int minimizeMax(int[] nums, int p) {  
        Arrays.sort(nums);
        int left=0;
        int n=nums.length;
        int right=nums[n - 1] - nums[0];
        while(left<right){
            int mid=left+(right-left)/2;
            if(canForm(nums,p,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }

    public boolean canForm(int nums[],int p,int maxDiff){
        int count = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i + 1] - nums[i] <= maxDiff) {
                count++;
                i += 2; // skip this pair (non-overlapping)
            } else {
                i++;
            }
        }

        return count >= p;
    }
}