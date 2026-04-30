class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=1;
        int high=0;
        for(int n:weights){
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
    public boolean check(int a[],int d,int w){
        int total=0;
        int daysUsed=1;
        for(int n: a){
            if(total+n<= w){
                total += n;
            } else {
                    daysUsed++;
                    total = n;
                    if (daysUsed > d) {
                        return false;
                    }
            }
        }
        return true;
    }
}
