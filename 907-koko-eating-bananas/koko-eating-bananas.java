class Solution {
    public int minEatingSpeed(int[] nums, int c) {
        int l=1;
        int h=0;
        int n=nums.length;
        for(int i:nums){
            h=Math.max(h,i);
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            if(check(mid,nums,c)){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean check(int k, int[] nums, int h) {
    int time = 0;

    for (int pile : nums) {
        time += (pile + k - 1) / k; // ceil
        if (time > h) return false; 
    }
    return time <= h;
}
    
}