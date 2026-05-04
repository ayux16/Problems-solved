class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int i=0;
        int j=n-1;
        reverse(nums,0,j);
        reverse(nums,i,k-1);
        reverse(nums,k,j);
    }
    public void reverse(int nums[], int start, int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}