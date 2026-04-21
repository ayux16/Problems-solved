class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        List<Integer>[] freq=new List[arr.length+1];

        Map<Integer,Integer> hm=new HashMap<>();
        for(int n: arr){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int uniqueCount=hm.size();

        for(int i=0;i<freq.length;i++){
            for(int n:freq[i]){
                if(k>=i){
                    k=k-i;
                    uniqueCount--;
                }
                else{
                    return uniqueCount;
                }
            } 
        }
        return uniqueCount;
    }
}