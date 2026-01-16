class Solution {
    public int findMaxLength(int[] nums) {
        int pref[]=new int[nums.length];
        int n=nums.length;
        
        for(int i=0 ;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            else if(nums[i]==1){
                nums[i]=1;
            }
        }
        pref[0]=nums[0];
        for(int i=1 ;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }

        int maxLen=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0, -1);
        for(int i=0;i<n;i++){
            int sum=pref[i];
            if (hm.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }
        return maxLen;
    }
}
