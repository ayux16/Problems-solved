class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int x=nums.length;
        List<Integer> freq[]=new List[x+1];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<x;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<=x;i++){
            freq[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int j=0;
        int ans[]=new int[k];
        for(int i=freq.length-1;i>=0 && j<=k;i--){
            for(int n:freq[i]){
                ans[j++]=n;
                if(j==k){
                    return ans;
                }
            }
        }
        return ans;
    }
}