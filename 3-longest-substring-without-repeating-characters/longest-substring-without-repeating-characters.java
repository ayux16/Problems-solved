class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int len=0;
        HashSet<Character> hs=new HashSet<>();
        while(r<n){
            char ch=s.charAt(r);
            if(!hs.contains(ch)){
                hs.add(ch);
                r++;
            }
            else{
                ch=s.charAt(l);
                hs.remove(ch);
                l++;
            }
            len=Math.max(len,r-l);
        }
        return len;
    }
}