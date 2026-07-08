class Solution {
    int ans[][];

    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int n = mat.length;
        int m = mat[0].length;
        ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    ans[i][j] = 0;
                    q.offer(new int[] { i, j});
                } else {
                    ans[i][j] = -1;
                }
            }
        }
        bfs(mat, n, m, q);
        return ans;
    }

    public void bfs(int nums[][], int n, int m, Queue<int[]> q) {
        int time = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                int cell[] = q.poll();
                int i = cell[0];
                int j = cell[1];
                if (i < n - 1 && ans[i + 1][j] == -1) {
                    ans[i + 1][j] = ans[i][j] + 1;
                    q.offer(new int[] {i + 1, j});
                }
                if (i > 0 && ans[i - 1][j] == -1) {
                    ans[i - 1][j] = ans[i][j] + 1;
                    q.offer(new int[] { i - 1, j});
                }
                if (j < m - 1 && ans[i][j + 1] == -1) {
                    ans[i][j + 1] = ans[i][j]+ 1;
                    q.offer(new int[] { i, j + 1});
                }
                if (j > 0 && ans[i][j - 1] == -1) {
                    ans[i][j - 1]  = ans[i][j]+ 1;
                    q.offer(new int[] { i, j - 1});
                }
                size--;
            }

        }
    }
}
