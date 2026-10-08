class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ex) {
        List<Boolean> ans=new ArrayList<>();
        int n=c.length;
        int maxCand=0;
        for(int i=0;i<n;i++){
            maxCand=Math.max(c[i],maxCand);
        }
        for(int i=0;i<n;i++){
            if(c[i]+ex>=maxCand){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}