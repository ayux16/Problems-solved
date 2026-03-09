class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int n:nums){
            int mod=n%3;
            count+=Math.min(mod,3-mod);
        }
        return count;
    }
}

