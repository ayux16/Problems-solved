class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int t=sum-goal;
            if(hm.containsKey(t)){
                count+=hm.get(t);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}