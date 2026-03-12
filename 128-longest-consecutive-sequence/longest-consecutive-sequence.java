class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums){hs.add(n);}
        // int n=nums.length;
        int maxLen=0;

        for(int n: hs){
            if(!hs.contains(n-1)){
                int curr = n;
                int len=1;
                while(hs.contains(curr + 1)){
                    curr++;
                    len++;
                }
            maxLen=Math.max(len,maxLen);
            }
        }
        return maxLen;
    }
}