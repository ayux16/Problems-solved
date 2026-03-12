class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        int length=0;
        for(int n:hs){
            if(!hs.contains(n-1)){
                int j=1;
                while(hs.contains(n+j)){
                    j++;
                }
                length=Math.max(length,j);
            }
        }
        return length;
    }
}