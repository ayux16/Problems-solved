class Solution {
    public int trap(int[] A) {
        int n=A.length;
        int i=0,j=n-1,leftMax=0,rightMax=0;
        int water=0;
        while(i<j){
            leftMax=Math.max(leftMax,A[i]);
            rightMax=Math.max(rightMax,A[j]);

            if(leftMax<rightMax){
                water+=leftMax-A[i];
                i++;
            }
            else{
                water+=rightMax-A[j];
                j--;
            }
        }
        return water;
    }
}