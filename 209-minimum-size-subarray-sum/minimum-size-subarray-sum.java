class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int len=n+1;
        int i=0,j=0;
        while(j<n){
            sum=sum+nums[j];
            while(sum>=target){
                len=Math.min(len,j-i+1);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return len==n+1?0:len;
    }
}

// 2 3 1 2 4 3
//       i
//         j
// sum=6
// len=4