class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && dq.getLast()<nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        li.add(dq.getFirst());
        int s=1,e=k;
        while(e<nums.length){
            if(dq.size()!=0 && dq.getFirst()==nums[s-1]){
                dq.removeFirst();
            }
            while(dq.size()!=0 && dq.getLast()<nums[e]){
                dq.removeLast();
            }
            dq.addLast(nums[e]);
            li.add(dq.getFirst());
            s++;
            e++;
        }

        int a[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            a[i]=li.get(i);
        }
        return a;
    }
}