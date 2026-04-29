class Solution {
    public int trap(int[] height) {
        int i=0;
        int n=height.length;
        int j=n-1;
        int maxLeft=0;
        int maxRight=0;
        int ans=0;
        while(i<j){
            maxLeft=Math.max(maxLeft,height[i]);
            maxRight=Math.max(maxRight,height[j]);

            if(maxLeft<maxRight){
                ans+=maxLeft-height[i];
                i++;
            }
            else{
                ans+=maxRight-height[j];
                j--;
            }
        }
        return ans;
    }
}