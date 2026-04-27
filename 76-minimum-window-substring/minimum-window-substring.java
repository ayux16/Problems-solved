class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        if(n<t.length()){
            return "";
        }

        int i=0,j=0,minWindow=Integer.MAX_VALUE,startIndex=-1;
        Map<Character,Integer> hm= new HashMap<>();
        for(char ch: t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int freq=hm.size();
        while(j<n){
            char ch=s.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    freq--;
                }
            }
            while(freq==0){
                int len=j-i+1;
               // minWindow=Math.min(len,minWindow);
                if(len<minWindow){
                    minWindow=len;
                    startIndex=i;
                }
                ch=s.charAt(i);
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)+1);
                    if(hm.get(ch)>0){
                        freq++;
                    }
                }
                i++;
            }
            j++;
        }
        if(startIndex==-1){
            return "";
        }
        return s.substring(startIndex,startIndex+minWindow);
    }
}
