class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        int sum=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=nums[i]+sum;
            int x=sum-k;
            if(hm.containsKey(x)){
                count+=hm.get(x);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}