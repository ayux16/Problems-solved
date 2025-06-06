class Solution {
    public int countSubstrings(String s) {
        int count =0; 
        int n=s.length(); 
        for(int i=0;i<n;i++){
            count+=checkPal(s,i,i);
            count+=checkPal(s,i,i+1);
        }
        return count;
    }
    public int checkPal(String s,int i,int j){
        int count =0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            j++;
            i--;
        }
        return count;
    }
}