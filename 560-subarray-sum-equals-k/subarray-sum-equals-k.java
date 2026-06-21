class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        hm.put(0,1);
        for(right=0;right<nums.length;right++){
            sum+=nums[right];
            int x=sum-k;
            if(hm.containsKey(x)){
                count+=hm.getOrDefault(x,1);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}