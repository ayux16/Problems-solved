class Solution {
    public double findMaxAverage(int[] A, int k) {
        int n=A.length;
        double ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=A[i];
        }
        ans=Math.max(ans,(double)sum/k);
        int s=1,e=k;
        while(e<n){
            sum=sum-A[s-1]+A[e];
            ans=Math.max(ans,(double)sum/k);
            s++;
            e++;
        }
        return ans;
    }
}