class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pf[]=new int[n];
        int sf[]=new int[n];

        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        sf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i]=sf[i+1]+nums[i];
        }

        for(int i=0;i<n;i++){
            if(sf[i]==pf[i]){
                return i;
            }
        }
        return -1;
    }
}