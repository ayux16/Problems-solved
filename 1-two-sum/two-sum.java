class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int t=target-nums[i];
            if(hm.containsKey(t)){
                return new int[]{hm.get(t),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}