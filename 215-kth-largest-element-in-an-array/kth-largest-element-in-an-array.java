class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((Integer a,Integer b)->  b-a);
        for(int n:nums){
            pq.add(n);
        }
        int ele=0;
        while(k>0){
            ele=pq.remove();
            k--;
        }
        return ele;
    }
}