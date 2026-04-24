class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        int ans[]=new int[26];
        for(int i=0;i<s1.length();i++){
            ans[s1.charAt(i)-'a']--;
            ans[s2.charAt(i)-'a']++;
        }
        if(check(ans)){return true;}
        for(int i=s1.length();i<s2.length();i++){
            ans[s2.charAt(i)-'a']++;
            ans[s2.charAt(i-s1.length())-'a']--;
            if(check(ans)){return true;}
        }
        return false;
    }
    public boolean check(int ans[]){
        for(int n: ans){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}