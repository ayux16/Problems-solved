class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int t=sum-k;
            if(hm.containsKey(t)){
                count+=hm.getOrDefault(t,0);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}