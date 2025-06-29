class Solution {
    public String breakPalindrome(String pal) {
        if(pal.length()==1) return "";
        char ch[]=pal.toCharArray();
        for(int i=0;i<pal.length()/2;i++){
            if(ch[i]!='a'){
                ch[i]='a';
                return new String(ch);
            }
        }
        ch[pal.length()-1]='b';
        return new String(ch);
    }
}