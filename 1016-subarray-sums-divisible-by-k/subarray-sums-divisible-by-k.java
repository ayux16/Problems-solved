class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count=0;
        for(int n:nums){
            sum+=n;
            // int res=((sum+k)%k)%k;
            int res=sum%k;
            if(res<0){
                res+=k;
            }
            count+=hm.getOrDefault(res,0);
            hm.put(res,hm.getOrDefault(res,0)+1);
        }
        return count;
    }
}