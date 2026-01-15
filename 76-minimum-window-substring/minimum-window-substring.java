import utils.FrequencyMap;

class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        FrequencyMap<Character> freq=new FrequencyMap<>();
        for(char num: t.toCharArray()){
            freq.increment(num);
        }
        int requiredChars=freq.size();
        int l=0;
        int r=0;
        int startIndex=-1;
        int maxWindow=Integer.MAX_VALUE;
        while(r<n){
            char ch=s.charAt(r);
            if(freq.containsKey(ch)){
                freq.decrement(ch);
                if(freq.get(ch)==0){
                    requiredChars--;
                }
            }
            while(requiredChars==0){
                int len=r-l+1;
                if(len<maxWindow){
                    maxWindow=len;
                    startIndex=l;
                }
                ch=s.charAt(l);
                if(freq.containsKey(ch)){
                    freq.increment(ch);
                    if(freq.get(ch)>0){
                        requiredChars++;
                    }
                }
                l++;
            }
            r++;
        }
        if(startIndex==-1) return "";
        return s.substring(startIndex,startIndex+maxWindow);
    }
}