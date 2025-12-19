class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int pf[]=new int[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        hm.put(0,1);
        for(int i=0;i<n;i++){
            if(hm.containsKey(pf[i]-k)){
                count+=hm.get(pf[i]-k);
            }
            hm.put(pf[i],hm.getOrDefault(pf[i],0)+1);
        }
        return count;
    }
}