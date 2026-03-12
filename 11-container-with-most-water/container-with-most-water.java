class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,r=n-1,maxL=0,maxR=0;
        int water=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            water=Math.max(h*w,water);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return water;
    }
}