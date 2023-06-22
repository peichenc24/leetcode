class Solution {
    public int[] pondSizes(int[][] land) {
        int m = land.length, n = land[0].length;
        List<Integer> resList = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 0) {
                    resList.add(dfs(land, i, j));
                }
            }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        Arrays.sort(res);
        return res;
    }

    public int dfs(int[][] land, int x, int y) {
        int m = land.length, n = land[0].length;
        if (x < 0 || x >= m || y < 0 || y >= n || land[x][y] != 0) {
            return 0;
        }
        land[x][y] = -1;
        int res = 1;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) {
                    continue;
                }
                res += dfs(land, x + dx, y + dy);
            }
        }
        return res;
    }
}
