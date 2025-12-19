class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int left=0;
        int right=0;
        int n=s.length();
        int max=0;
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
            max=Math.max(max,right-left);
        }
        return max;
    }
}