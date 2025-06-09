class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length(),m=t.length(),i=0,j=0,cost=0,len = -1*n*m;
        while(j<n){
            cost+=Math.abs(s.charAt(j)-t.charAt(j));
            while(cost>maxCost){
                cost-=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;   
        }
        return len;
    }
}