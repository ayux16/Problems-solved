class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //len min 2
        //and div by k
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hm.containsKey(rem)){
                if(i-hm.get(rem)>=2){
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