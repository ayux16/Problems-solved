class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(String s: strs){
            int ch[]=new int[26];
            for(int c: s.toCharArray()){
                ch[c-'a']++;
            }
            String key=Arrays.toString(ch);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}