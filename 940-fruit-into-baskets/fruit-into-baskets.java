class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0, ans=0;
        for(int i=0;i<fruits.length;i++){
            hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
            if(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}