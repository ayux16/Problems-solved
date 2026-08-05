class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count=0;
        int pf[]=new int[n];
        if(nums[0]%2!=0){
            pf[0]=1;
        }
        for(int i=1;i<n;i++){
            if(nums[i]%2!=0){
                pf[i]=1;
            }
            pf[i]=pf[i-1]+pf[i];
        }
        for(int i=0;i<nums.length;i++){
            int t=pf[i]-k;
            if(hm.containsKey(t)){
                count+=hm.get(t);
            }
            hm.put(pf[i],hm.getOrDefault(pf[i],0)+1);
        }
         return count; 
    }
}