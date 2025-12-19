class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int n=s.length();
        int MaxLength=0;
        HashSet<Character> hs=new HashSet<>();
        while(right<n){
            char ch=s.charAt(right);
            if(!hs.contains(ch)){
                hs.add(ch);
                right++;
            }
            else{
                ch=s.charAt(left);
                hs.remove(ch);
                left++;
            }
            MaxLength=Math.max(MaxLength,right-left);
        }
        return MaxLength;
    }
}