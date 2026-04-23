class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                if(i - hm.get(rem)>=2){
                    return true;
                }
            }else{
                hm.put(rem,i);
            }
        }
        return false;
    }
}