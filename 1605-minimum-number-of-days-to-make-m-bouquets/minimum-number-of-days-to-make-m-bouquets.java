class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if((long) m * k > bloomDay.length) return -1;
        if (bloomDay.length < m * k) return -1;
        int low=Integer.MAX_VALUE;;
        int high=Integer.MIN_VALUE;
        for(int n: bloomDay){
            low=Math.min(n,low);
            high=Math.max(n,high);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(bloomDay,k,mid)<m){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }

    public int check(int[] arr,int k, int mid){
        int flowerCollected=0,bouquet=0;
        for(int bou: arr){
            if(bou<=mid){
                flowerCollected++;
            }
            else{
                flowerCollected=0;
            }
            if(flowerCollected==k){
                bouquet++;
                flowerCollected=0;
            }
        }
        return bouquet;
    }
}