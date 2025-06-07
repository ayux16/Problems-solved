class Solution {
    public String breakPalindrome(String p) {
        int n=p.length();
        if(n==1) return "";
        char ch[]=p.toCharArray();
        for(int i=0;i<n/2;i++){
            if(ch[i] != 'a'){
                ch[i]='a';
                return new String(ch);
            }
        }
        ch[n-1]='b';
        return new String(ch);
    }
}