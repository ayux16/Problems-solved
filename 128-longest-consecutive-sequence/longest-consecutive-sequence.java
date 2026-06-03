class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>hs=new HashSet<>();
        for(int n:nums){hs.add(n);}
        // int n=nums.length;
        int ans=0;

        for(int n: hs){
          if(!hs.contains(n-1)){
            int len=1;
            while(hs.contains(n+len)){
                len+=1;
            }
            ans=Math.max(len,ans);
          }  
        }
        return ans;
    }
}