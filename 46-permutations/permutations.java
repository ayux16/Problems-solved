class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> subset=new ArrayList<>();
        ans=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        perm(nums,subset,visited);
        return ans;
    }
    public void perm(int nums[],List<Integer> subset,boolean visited[]){
        if(subset.size()==nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            subset.add(nums[i]);
            visited[i]=true;
            perm(nums,subset,visited);
            subset.remove(subset.size()-1);
            visited[i]=false;
        }
    }
}