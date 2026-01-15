class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        List<Integer> freq[]=new List[nums.length+1];

        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entries : hm.entrySet()){
            freq[entries.getValue()].add(entries.getKey());
        }

        int j=0;
        int ans[]=new int[k];

        for(int i=freq.length-1;i>0 && j<k; i--){
            for(int n : freq[i]){
                ans[j++]=n;
                if(j==k) return ans;
            }
        }
        return ans;
    }
}