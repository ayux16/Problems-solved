class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char ch[]=new char[26];
        for(int i=0;i<s.length();i++){
            ch[t.charAt(i)-'a']--;
            ch[s.charAt(i)-'a']++;
        }
        if(!check(ch)){
            return false;
        }
        return true;
    }
    public boolean check(char ch[]){
        for(char c: ch){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}