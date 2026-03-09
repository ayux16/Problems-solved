class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int r=0,l=0;
        int maxRepeat=0;
        int maxWindow=0;
        int n=s.length();
        for(r=0;r<n;r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxRepeat=Math.max(maxRepeat,hm.get(ch));
            if(r-l+1-maxRepeat>k){
                ch=s.charAt(l);
                hm.put(ch,hm.get(ch)-1);
                l++;
            }
            maxWindow=Math.max(maxWindow,r-l+1);
        }
        return maxWindow;
    }
}