import utils.FrequencyMap;

class Solution {
    public int totalFruit(int[] fruits) {
        FrequencyMap<Integer> freq=new FrequencyMap<>();
        int l=0, ans=0;
        for(int i=0;i<fruits.length;i++){
            freq.increment(fruits[i]);
            if(freq.size()>2){
                freq.decrement(fruits[l]);
                if(freq.get(fruits[l])==0){
                    freq.remove(fruits[l]);
                }
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}