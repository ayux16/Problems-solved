class Solution {
    String ans="";
    public String longestPalindrome(String s) {
        int n=s.length();
        check(s,0,n);
        check(s,1,n);
        return ans;
    }
    public void check(String s, int x, int n){
        for(int e=0;e<n;e++){
            int i=e;
            int j=e+x;
            while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
                j++;
                i--;
            }
            String sub=s.substring(i+1,j);
            if(sub.length()>ans.length()){
                ans=sub;
            }
        }
    }
}