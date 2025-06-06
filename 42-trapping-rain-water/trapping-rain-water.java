class Solution {
    public int trap(int[] A) {
        int n=A.length;
        int i=0;
        int j=n-1;
        int left=0;
        int right=0;
        int ans=0;
        while(i<j){
            left=Math.max(left,A[i]);
            right=Math.max(right,A[j]);
            if(left<right){
                ans+=(left-A[i]);
                i++;
            }
            else{
                ans+=(right-A[j]);
                j--;
            }
        }
        return ans;
    }
}