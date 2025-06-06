class Solution {
    public int maxScore(int[] c, int k) {
         int n=c.length;
        int left[]=new int[k+1];
        int right[]=new int[k+1];
        left[0]=0;
        right[0]=0;
        for(int i=0;i<k;i++){
            left[i+1]=left[i]+c[i];
            right[i+1]=right[i]+c[n-1-i];
        }
        int max=0;
        for(int i=0;i<=k;i++){
            int t=left[i]+right[k-i];
            max=Math.max(t,max);
        }
        return max;
    }
}