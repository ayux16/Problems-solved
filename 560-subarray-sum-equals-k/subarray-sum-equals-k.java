class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int pf[]=new int[n];
        pf[0]=nums[0];
        for(int i=1;i<n;i++){
            pf[i]=pf[i-1]+nums[i];
        }
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int count=0;
        for(int i=0;i<n;i++){
            if(hm.containsKey(pf[i]-k)){
                count+=hm.get(pf[i]-k);
            }
            hm.put(pf[i],hm.getOrDefault(pf[i],0)+1);
        }
        return count;
    }
}


/*
if possitive only then this will work fabously
public int subarraySum(int[] nums, int k) {
        int count=0;
        int left=0,n=nums.length,sum=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>k && left<=right){
                sum-=nums[left];
                left++;
            }
            if(sum==k && left<=right){
                count++;
            }
        }
        return count;
    }
*/