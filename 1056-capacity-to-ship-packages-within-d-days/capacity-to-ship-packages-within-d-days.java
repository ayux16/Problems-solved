class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int n: weights){
            low=Math.max(low,n);
            high+=n;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int []nums, int days, int mid){
        int sum=0;
        int day=1;
        for(int n: nums){
            if(sum+n>mid){
                day++;
                sum=0;
            } 
            sum+=n;
        }
        if(day<=days){
                return true;
            }
        return false;
    }
}