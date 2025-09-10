class Solution {
    public int trap(int[] A) {
        int n=A.length;
        int i=0,j=n-1;
        int leftMax=0,rightMax=0;
        int ans=0;
        while(i<j){
            leftMax=Math.max(A[i],leftMax);
            rightMax=Math.max(A[j],rightMax);

            if(leftMax<rightMax){
                ans+=leftMax-A[i];
                i++;
            }
            else{
                ans+=rightMax-A[j];
                j--;
            }
        }
        return ans;
    }
}