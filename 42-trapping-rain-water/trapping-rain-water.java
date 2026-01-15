class Solution {
    public int trap(int[] A) {
        int l=0,maxLeft=0,maxRight=0;
        int n=A.length,r=n-1;
        int water=0;
        while(l<r){
            maxLeft=Math.max(A[l],maxLeft);
            maxRight=Math.max(A[r],maxRight);

            if(maxLeft<maxRight){
                water+=maxLeft-A[l];
                l++;
            }
            else{
                water+=maxRight-A[r];
                r--;
            }
        }
        return water;
    }
}