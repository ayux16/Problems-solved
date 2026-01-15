class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        int maxRepeat=0,maxLength=0,l=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxRepeat=Math.max(maxRepeat,hm.get(ch));
            if(r-l+1-maxRepeat>k){
                ch=s.charAt(l);
                hm.put(ch,hm.get(ch)-1);
                l++;
            }
            maxLength=Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}