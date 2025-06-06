class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int p1=i+1;
            int p2=n-1;
            while(p1<p2){
                int s=nums[i]+nums[p1]+nums[p2];
                if(Math.abs(target-s) < Math.abs(ans)){
                    ans=(target-s);
                }
                else if(s<target){
                    p1++;
                }
                else{
                    p2--;
                }
            }

        }
        return target-ans;
    }
}