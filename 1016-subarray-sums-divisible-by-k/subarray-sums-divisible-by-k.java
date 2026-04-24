class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        long sum=0;
        Map<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=(int)(sum%k);
            if(rem<0){rem+=k;}
            count+=hm.getOrDefault(rem,0);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return count;
    }
}