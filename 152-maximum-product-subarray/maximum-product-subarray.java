class Solution {
    public int maxProduct(int[] A) {
        int max = A[0];
        int n = A.length;
        int min = A[0];
        int ans = A[0];
        if (n == 1) {
            return A[0];
        }
        for (int i = 1; i < n; i++) {
            int temp=max;
            max = Math.max(max * A[i], Math.max( A[i], min*A[i]));
            min = Math.min(min * A[i], Math.min( A[i], temp*A[i]));
            ans = Math.max(ans, max);
        }
        return ans;
    }
}