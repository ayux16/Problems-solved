class Solution {
    int count=0;
    public int countSubstrings(String s) {
        int n=s.length();
        check(s,0,n);
        check(s,1,n);
        return count;
    }
    public void check(String s, int x, int n) {
        for (int e = 0; e < n; e++) {
            int i = e;
            int j = e + x;
            while (i >= 0 && j < n && s.charAt(i) == s.charAt(j)) {
                j++;
                i--;
                count++;
            }
        }
    }
}