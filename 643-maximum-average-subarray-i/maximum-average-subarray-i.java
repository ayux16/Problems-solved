class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=(double)sum/k;
        int s=1,e=k;
        while(e<nums.length){
            sum=sum-nums[s-1];
            sum+=nums[e];
            avg=Math.max(avg,(double)sum/k);
            s++;
            e++;
        }
        return avg;
    }
}