class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++){
            ch[t.charAt(i)-'a']--;
            ch[s.charAt(i)-'a']++;
        }
        if(!check(ch)){
            return false;
        }
        return true;
    }
    public boolean check(int ch[]){
        for(int c: ch){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}