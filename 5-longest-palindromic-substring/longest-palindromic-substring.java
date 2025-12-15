class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String sub="";
        for(int i=0;i<n;i++){
            int p1=i;
            int p2=i;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
            }
            String a=s.substring(p1+1,p2);
            if(a.length()>sub.length()){
                sub=a;
            }
        }
        for(int i=0;i<n;i++){
            int p1=i;
            int p2=i+1;
            while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2)){
                p1--;
                p2++;
            }
            String a=s.substring(p1+1,p2);
            if(a.length()>sub.length()){
                sub=a;
            }
        }
        return sub;
    }
}