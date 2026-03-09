class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int n=s.length();
        int maxWindow=Integer.MIN_VALUE;
        int l=0,r=0;
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
            maxWindow=Math.max(maxWindow,r-l);
        }
        return maxWindow==Integer.MIN_VALUE?0:maxWindow;
    }
}