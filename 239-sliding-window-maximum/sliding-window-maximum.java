class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
         List<Integer>ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && dq.getLast()<nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        ans.add(dq.getFirst());
        int s=1,e=k;
        while(e<n){
            if(!dq.isEmpty() && dq.getFirst()==nums[s-1]){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && dq.getLast()<nums[e]){
                dq.removeLast();
            }
            dq.addLast(nums[e]);
            ans.add(dq.getFirst());
            s++;e++;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}