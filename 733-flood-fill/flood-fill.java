class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int count = 0;
        int originalColor=image[sr][sc];
        rec(image, sr, sc, n, m, color, originalColor); 
        return image;
    }

    public boolean rec(int nums[][], int i, int j, int n, int m, int target,int originalColor) {
        if (i < 0 || j < 0 || i > n - 1 || j > m - 1
                || nums[i][j] == target) {
            return false;
        }
        if(nums[i][j]!=originalColor){
            return false;
        }
        nums[i][j]=target;
        rec(nums, i + 1, j, n, m,target,originalColor);
        rec(nums, i - 1, j, n, m,target,originalColor);
        rec(nums, i, j - 1, n, m,target,originalColor);
        rec(nums, i, j + 1, n, m,target,originalColor);
        return true;
    }
}