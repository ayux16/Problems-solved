class Solution {
    public int totalFruit(int[] nums) {
        int n=nums.length;
        int ans=0;
        int l=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.size()>2){
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
        ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}