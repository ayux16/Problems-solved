class Solution {
    public int shortestSubarray(int[] nums, int k) {
        ArrayDeque<Integer> al=new ArrayDeque<>();
        int n=nums.length;
        long[] pf = new long[n + 1];
        for(int i = 0; i < n; i++){
            pf[i + 1] = pf[i] + nums[i];
        }
        int len=Integer.MAX_VALUE;
        for(int i = 0; i <= n; i++) {
            while(!al.isEmpty() && pf[i] - pf[al.peekFirst()] >= k){
                len = Math.min(len, i - al.pollFirst()); // index - index ✓
        }
            while(!al.isEmpty() && pf[i] <= pf[al.peekLast()]){
                  al.pollLast();
            }
            al.addLast(i);
        }
        return len==Integer.MAX_VALUE? -1 : len;
    }
}
