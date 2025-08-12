class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int [n*2];
        int i=0;
        int j=0;
        while(i<n*2){
            if(i<n){
                ans[i]=nums[i];
                i++;
            }
            else{
                ans[i]=nums[j];
                j++;
                i++;
            }
        }
        return ans;
    }
}
/*
i=0 1 
i=1 2
i=2 3 n=3
i+n
*/