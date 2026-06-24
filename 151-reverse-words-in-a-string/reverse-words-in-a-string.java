class Solution {
    public String reverseWords(String s) {
        String ch[]=s.trim().split("\\s+");
        int i=0,j=ch.length-1;
        while(i<j){
            String temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String res=String.join(" ",ch);
        return res;
    }
}