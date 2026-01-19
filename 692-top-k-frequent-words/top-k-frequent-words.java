class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            hm.put(s,hm.getOrDefault(s,0)+1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq =  new PriorityQueue<>((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // higher freq first
            }
            return a.getKey().compareTo(b.getKey()); // lexicographically smaller first
        });
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            pq.add(e);
        }

        List<String> li=new ArrayList<>();
        for(int i=0;i< hm.size() && i<k;i++){
            if(i<k){
                li.add(pq.poll().getKey());
            }
        }
        return li;
    }
}