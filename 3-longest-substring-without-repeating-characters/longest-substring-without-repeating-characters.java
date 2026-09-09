class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int i=0;
        int j=0;
        int len=0;
        for(j=0;j<s.length();j++){
            char ch=s.charAt(j);
            while(hs.contains(ch)){
                hs.remove(s.charAt(i));
                i++;
            }
            hs.add(ch);
            if(len<j-i+1){
                len=j-i+1;
            }
        }
        return len;
    }
}