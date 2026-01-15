import utils.ArrayUtils;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ch[]=new int[26];
        int n=s.length();
        int m=p.length();
        if(m>n){
            return new ArrayList<>();
        }
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<m;i++){
            ch[p.charAt(i)-'a']++;
            ch[s.charAt(i)-'a']--;
        }
        if(ArrayUtils.allZero(ch)) al.add(0);
        for(int i=m;i<n;i++){
            ch[s.charAt(i)-'a']--;
            ch[s.charAt(i-m)-'a']++;
            if(ArrayUtils.allZero(ch)){
                al.add(i-m+1);
            }
        }
        return al;
    }
}