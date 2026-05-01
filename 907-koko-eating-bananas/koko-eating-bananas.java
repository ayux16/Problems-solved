class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int n:piles){
            high=Math.max(high,n);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(piles,mid,h)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean check(int nums[],int mid,int hour){
        int pile=0;
        for(int n: nums){
            pile+=(n+mid-1)/mid;
            if(pile>hour){
                return false;
            }
        }

        return pile<=hour;
    }
}