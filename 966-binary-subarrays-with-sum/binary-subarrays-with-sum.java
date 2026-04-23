class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int target=sum-goal;
            count+=hm.getOrDefault(target,0);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}