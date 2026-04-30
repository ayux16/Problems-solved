class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int l=0;
        int h=n-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(letters[mid]>target){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans==-1? letters[0] : letters[ans];
    }
}