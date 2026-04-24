class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int left=0;
        int maxLen=0;
        int maxRepeat=0;
        int n=s.length();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxRepeat=Math.max(maxRepeat,hm.get(ch));
            if(right-left+1-maxRepeat>k){
                ch=s.charAt(left);
                hm.put(ch,hm.get(ch)-1);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;

    }
}