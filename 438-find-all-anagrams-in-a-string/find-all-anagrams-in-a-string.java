class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    int n=s.length();
    int m=p.length();
    if(n<m) return new ArrayList<>();
    int ch[]=new int[26];
    ArrayList<Integer> ag=new ArrayList<>();
    for(int i=0;i<m;i++){
        char c1=s.charAt(i);
        char c2=p.charAt(i);
        ch[c2-'a']++;
        ch[c1-'a']--;
    }
   
    if(allZero(ch)) ag.add(0);
    int track=0;
    for(int i=m;i<n;i++){
            ch[s.charAt(i)-'a']--;
            ch[s.charAt(i-m)-'a']++;
            if(!allZero(ch)){
                
                track=i;
            }
            if(allZero(ch)){
                track=i-m+1;
                ag.add(track);
            }
        }
    return ag;
    }
    public boolean allZero(int ch[]){
        for(int n:ch){
            if(n!=0){
                return false;
            }
        }
        return true;
    }

}