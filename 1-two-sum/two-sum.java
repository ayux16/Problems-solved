class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int tar=target-nums[i];

            if(hm.containsKey(tar)){
                return new int[]{hm.get(tar),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}