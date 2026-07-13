class Solution {
    boolean visit[];
    public int findCircleNum(int[][] isConnected) {
        visit = new boolean[isConnected.length];
        int count = 0;
        for (int neigh = 0; neigh < isConnected[0].length; neigh++) {
            if (!visit[neigh]) {
                dfs(neigh, isConnected);
                count++;
            }
        }
        return count;
    }

    public void dfs(int city, int isConnected[][]) {
        if (visit[city]) {
            return;
        }
        visit[city] = true;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[city][i] == 1 && !visit[i]) {
                dfs(i, isConnected);
            }
        }
    }
}