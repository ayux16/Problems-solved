class Solution {
    List<List<Integer>>ag;
    public boolean validPath(int n, int[][] edge, int source, int destination) {
        ag=new ArrayList<>();
        boolean visited[]=new boolean[n];
         for(int i=0;i<n;i++){
            ag.add(new ArrayList<>());
        }
        Arrays.fill(visited,false);

        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            ag.get(u).add(v);
            ag.get(v).add(u);
        }
        dfs(source,visited);
        if(visited[destination]){
            return true;
        }
        return false;
    }
    public void dfs(int s,boolean []visit){
        if(visit[s]){
            return;
        }
        visit[s]=true;
        for(int n: ag.get(s)){
            dfs(n,visit);
        }
    }
}