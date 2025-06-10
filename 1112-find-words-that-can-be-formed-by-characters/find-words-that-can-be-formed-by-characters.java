class Solution {
    public int countCharacters(String[] words, String chars) {
        int ch[]=new int[26];
        for(char c: chars.toCharArray()){
            ch[c-'a']++;
        }
        int len=0;
        for(String word: words){
            if(check(word,ch)){
                len+=word.length();
            }
        }
        return len;
    }
    public boolean check(String s,int a[]){
        int words[]=new int[26];
        for(char c: s.toCharArray()){
            words[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(words[i]>a[i]){
                return false;
            }
        }
        return true;
    }
}