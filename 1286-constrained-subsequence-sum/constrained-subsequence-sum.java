class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n=nums.length;
        int dp[]=new int[n];
        Deque<Integer> dq=new ArrayDeque<>();

        int ans=nums[0];
        dq.addLast(0);
        dp[0]=nums[0];

        for(int i=1;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<i-k){
                dq.removeFirst();
            }
            dp[i]=nums[i]+Math.max(0,dp[dq.peekFirst()]);
            ans=Math.max(ans,dp[i]);
            while(!dq.isEmpty() && dp[i]>dp[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        return ans;
    }
}