import utils.FrequencyMap;

class Solution {
    public int characterReplacement(String s, int k) {
        FrequencyMap<Character> freq=new FrequencyMap<>();
        int n=s.length();
        int maxRepeat=0,maxLength=0,l=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            freq.increment(ch);
            maxRepeat=Math.max(maxRepeat,freq.get(ch));
            if(r-l+1-maxRepeat>k){
                ch=s.charAt(l);
                freq.decrement(ch);
                l++;
            }
            maxLength=Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}