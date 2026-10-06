class Solution {
    public int maximumWealth(int[][] acc) {
        
        int c=acc[0].length;
        int maxWealth=-1;
        int j=0;
        for(int i=0;i<acc.length;i++){
            int sum=0;
            while(j<c){
                sum+=acc[i][j];
                j++;
            }
            maxWealth=Math.max(maxWealth,sum);
            j=0;
        }
        return maxWealth;
    }
}