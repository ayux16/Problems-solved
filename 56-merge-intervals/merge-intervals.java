class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        int currentStart=inter[0][0];
        int curEnd=inter[0][1];
        for(int i=0;i<inter.length;i++){
            int s1=inter[i][0];
            int e1=inter[i][1];

            if(s1<=curEnd){
                curEnd=Math.max(e1,curEnd);
            }
            else{
                ans.add(new int[]{currentStart,curEnd});
                currentStart=s1;
                curEnd=e1;
            }
        }
        ans.add(new int[]{currentStart, curEnd});
        return ans.toArray(new int[ans.size()][]);
    }
}