class RandomizedSet {

    Map<Integer,Integer> hm;
    List<Integer> li;
    Random random;
    int index;
    public RandomizedSet() {
        hm=new HashMap<>();
        li=new ArrayList<>();
        random=new Random();
    }
    
    public boolean insert(int val) {
        if(!hm.containsKey(val)){
            hm.put(val,li.size());
            li.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)){
            return false;
        }
        int indextoremove=hm.get(val);
        int lastindex=li.size()-1;
        int lastElement=li.get(lastindex);
        li.set(indextoremove,lastElement);
        li.remove(lastindex);
        hm.put(lastElement,indextoremove);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
         return li.get(random.nextInt(li.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */