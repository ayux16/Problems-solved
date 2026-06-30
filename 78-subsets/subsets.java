class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
        ans=new ArrayList<>();
        int n=nums.length;
        List<Integer> subset=new ArrayList<>();
        rec(0,nums,n,subset);
        return ans;
    }
    public static void rec(int i,int nums[],int n,List<Integer> subset){
        if(i==n){
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        rec(i+1,nums,n, subset);
        subset.remove(subset.size()-1);
        rec(i+1,nums,n,subset);
    }
}