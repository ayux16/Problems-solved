class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int n: weights){
            low=Math.max(low,n);
            high+=n;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
                high=mid;
            }else{
            low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int weights[],int days,int totalWeight){
        int DaysCount=1;
        int sum=0;
        for(int n: weights){
            if(sum+n > totalWeight){
                sum=n;
                DaysCount++;
            }
            else{
                sum+=n;
            }
        }
        return DaysCount <= days;
    }
}