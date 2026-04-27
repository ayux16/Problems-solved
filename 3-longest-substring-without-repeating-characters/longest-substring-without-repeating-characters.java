class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int j=0;
        int i=0;
        int n=s.length();
        int len=Integer.MIN_VALUE;
        while(j<n){
            char ch=s.charAt(j);
            if(!hs.contains(ch)){
                hs.add(ch);
                j++;
            }
            else{
                ch=s.charAt(i);
                hs.remove(ch);
                i++;
            }
            len=Math.max(len,j-i);
        }
        return len==Integer.MIN_VALUE?0:len;
    }
}