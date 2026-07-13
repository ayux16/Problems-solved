class Solution {
    List<List<Integer>> ag;
    boolean visit[];
    public boolean validPath(int n, int[][] edge, int source, int destination) {
        ag=new ArrayList<>();
        visit=new boolean[n];
        for(int i=0;i<n;i++){
            ag.add(new ArrayList<>());
            visit[i]=false;
        }
        for(int i=0;i<edge.length;i++){
            int u=edge[i][0];
            int v=edge[i][1];
            ag.get(u).add(v);
            ag.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        return bfs(q,destination);
    }
    public boolean bfs(Queue<Integer> q,int destination){
        while(!q.isEmpty()) {
            int current = q.poll();
            if (current == destination) {
                return true;
            }
            for(int neighbor: ag.get(current)) {
                if (!visit[neighbor]) 
                 { visit[neighbor] = true;
                    q.offer(neighbor);
                 }
            }
        }
        return false;
    }
}