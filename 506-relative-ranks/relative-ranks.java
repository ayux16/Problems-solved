class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->score[b]-score[a]);
        for(int i=0;i<score.length;i++){
            pq.add(i);
        }
        int count=1;
        String[] ans=new String[score.length];
        while(pq.size()!=0){
            int sc=pq.poll();
            if(count==1){
                ans[sc]="Gold Medal";
            }
            else if(count==2){
                ans[sc]="Silver Medal";
            }
            else if(count==3){
                ans[sc]="Bronze Medal";
            }
            else{
                ans[sc]=String.valueOf(count);
            }
            count++;
        }
        return ans;
    }
}