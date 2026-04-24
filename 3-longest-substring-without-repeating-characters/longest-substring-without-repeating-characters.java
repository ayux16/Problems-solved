class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0;
        int r=0;
        int maxLen=0;
        int n=s.length();
        int len=0;
        while(r<n){
            char ch=s.charAt(r);
            while(hs.contains(ch)){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(ch);
            maxLen=Math.max(r-l+1,maxLen);
            r++;
        }
        return maxLen;
    }
}