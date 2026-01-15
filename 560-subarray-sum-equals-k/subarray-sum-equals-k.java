import utils.ArrayUtils;
import utils.FrequencyMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int pf[]=ArrayUtils.prefixSum(nums);
        FrequencyMap<Integer> freq=new FrequencyMap<>();
        int count=0;
        freq.increment(0);
        for(int i=0;i<n;i++){
            if(freq.containsKey(pf[i]-k)){
                count+=freq.get(pf[i]-k);
            }
            freq.increment(pf[i]);
        }
        return count;
    }
}