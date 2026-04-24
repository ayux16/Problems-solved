class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int pf[]=new int[nums.length+1];
        int n=nums.length;
        // for(int i=0;i<=n;i++){
        //     pf[i+1]=pf[i+1]+nums[i];
        // }
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                if(i-hm.get(rem) >=2){
                    return true;
                }
            }
            else{
                hm.put(rem,i);
            }
        }
        return false;
    }
}