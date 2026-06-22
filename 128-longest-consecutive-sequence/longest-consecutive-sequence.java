class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        int maxCount=0;
        for(int n:hs){
            int len=1;
            if(!hs.contains(n-1)){
                while(hs.contains(n+len)){
                    len+=1;
                }
                maxCount=Math.max(len,maxCount);
            }
        }
        return maxCount;
    }
}