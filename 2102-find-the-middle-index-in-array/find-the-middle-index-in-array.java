class Solution {
    public int findMiddleIndex(int[] nums) {
        int pf[]=new int[nums.length];
        int sf[]=new int[nums.length];

        int n=nums.length;
        pf[0]=nums[0];
        sf[n-1]=nums[nums.length-1];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            sf[i]=sf[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            int left = (i == 0) ? 0 : pf[i - 1];
            int right = (i == n - 1) ? 0 : sf[i + 1];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}