class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char num: t.toCharArray()){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int freq=hm.size();
        int l=0;
        int r=0;
        int startIndex=-1;
        int maxWindow=Integer.MAX_VALUE;
        while(r<n){
            char ch=s.charAt(r);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    freq--;
                }
            }
            while(freq==0){
                int len=r-l+1;
                if(len<maxWindow){
                    maxWindow=len;
                    startIndex=l;
                }
                ch=s.charAt(l);
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)+1);
                    if(hm.get(ch)>0){
                        freq++;
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