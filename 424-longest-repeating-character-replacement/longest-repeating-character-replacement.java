class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int maxRepeat=0;
        int maxLen=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxRepeat=Math.max(maxRepeat,hm.get(ch));
            if(r-l+1-maxRepeat>k){
                ch=s.charAt(l);
                hm.put(ch,hm.get(ch)-1);
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;

    }
}