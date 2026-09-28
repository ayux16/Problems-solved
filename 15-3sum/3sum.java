class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int p1=0;p1<n;p1++){
            if(p1>0 && p1<n && nums[p1-1]==nums[p1]){
                continue;
            }
            int p2=p1+1;
            int p3=n-1;
            while(p2<p3){
                int sum=nums[p1]+nums[p2]+nums[p3];
                if(sum>0){
                    p3--;
                }
                else if(sum<0){
                    p2++;
                }
                else if(sum==0){
                    List<Integer> li=Arrays.asList(nums[p1],nums[p2],nums[p3]);
                    ans.add(li);
                    p2++;
                    p3--;
                    while(p2<p3 && nums[p2-1]==nums[p2]){
                        p2++;
                    }
                    while(p3>p2 && nums[p3+1]==nums[p3]){
                        p3--;
                    }
                }
            }
        }
        return ans;
    }
}