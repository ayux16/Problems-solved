class Solution {
    public int shortestSubarray(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        long pf[]=new long[n+1];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            pf[i+1]=pf[i]+nums[i];
        }
        for(int i=0;i<=n;i++){
            while(!dq.isEmpty() && pf[i]-pf[dq.peekFirst()]>=k){
                ans=Math.min(ans,i-dq.pollFirst());
            }
            while(!dq.isEmpty() && pf[i]<=pf[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}