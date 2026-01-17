class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            else{
                nums[i]=1;
            }
        }   
        int len=0;
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            if(hm.containsKey(sum)){
                len=Math.max(len,i-hm.get(sum));
            }
            if(!hm.containsKey(sum)){hm.put(sum,i);}
        }
        return len;
    }
}