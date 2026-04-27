class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        ans.add(dq.getFirst());
        int s=1,e=k;
        while(e<n){
            if(!dq.isEmpty() && dq.peekFirst()==nums[s-1]){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && dq.peekLast()<nums[e]){
                dq.removeLast();
            }
            dq.addLast(nums[e]);
            ans.add(dq.getFirst());
            e++;
            s++;
        }
        return ans.stream()
                        .mapToInt(Integer :: intValue)
                            .toArray();
    }
}