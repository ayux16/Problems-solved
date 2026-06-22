class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int pf[]=new int[nums.length];
        pf[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int rem=(int)(pf[i]%k);
            if(rem<0){
                rem+=k;
            }
            count+=hm.getOrDefault(rem,0);
            hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return count;
    }
}