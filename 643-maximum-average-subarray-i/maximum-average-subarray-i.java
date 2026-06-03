class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double ans=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        ans=(double)sum/k;
        int s=1,e=k;
        double avg=0;
        while(e<n){
            sum=sum+nums[e]-nums[s-1];
            avg=(double)sum/k;
            ans=Math.max(avg,ans);
            s++;
            e++;
        }
        return ans;
    }
}