class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int n:nums){
            if(!hs.contains(n)){
                hs.add(n);
            }
            else{return true;}
        }
        return false;
    }
}