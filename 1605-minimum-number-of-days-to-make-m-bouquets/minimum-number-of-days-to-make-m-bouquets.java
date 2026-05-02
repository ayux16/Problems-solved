class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k >n){
            return -1;
        }
        if(n < m*k){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int num: bloomDay){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }

        while(low<high){
            int mid=low+(high-low)/2;
            if(isPossible(bloomDay,k,mid)>=m){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public int isPossible(int arr[], int flower,int mid){
        int flowerCount=0,bouquetCount=0;
        for(int flowers : arr){
            if(flowers <= mid){
                flowerCount++;
            }
            else{
                flowerCount=0;
            }
            if(flowerCount==flower){
                bouquetCount++;
                flowerCount=0;
            }
        }
        return bouquetCount;
    }
}