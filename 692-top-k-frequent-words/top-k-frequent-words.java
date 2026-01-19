class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> hm=new HashMap<>();
        
        for(String s: words){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return b.getValue()-a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

        for(Map.Entry<String,Integer> entry : hm.entrySet()){
            pq.add(entry);
        }

        List<String> ans=new ArrayList<>();
        for(int i=0;i<k && !pq.isEmpty();i++){
            ans.add(pq.poll().getKey());
        }
        return ans;
    }
}