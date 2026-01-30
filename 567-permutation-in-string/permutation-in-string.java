class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(n>m) return false;
        int ans[]=new int[26];

        for(int i=0;i<n;i++){
            ans[s1.charAt(i)-'a']++;
            ans[s2.charAt(i)-'a']--;
        }
        if(check(ans)) return true;
        for(int i=n;i<m;i++){
            ans[s2.charAt(i)-'a']--;
            ans[s2.charAt(i-n)-'a']++;
            if(check(ans)){return true;}
        }
        return false;
    }
    public boolean check(int ans[]){
        for(int n:ans){ 
            if(n!=0){return false;}
        }
        return true;
    }
}