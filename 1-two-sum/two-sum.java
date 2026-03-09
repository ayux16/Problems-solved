class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            if(hm.containsKey(t)){
                return new int[]{hm.get(t),i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}