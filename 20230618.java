class Solution {

    int m;
    int n;
    int[][] grid;
    int count = 0;
    public int closedIsland(int[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;
        this.grid = grid;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0) {
                    if(DFS(i,j)) count++;
                }
            }
        }
        return count;
    }

    private boolean DFS(int i,int j){
        if(i<0 || j<0 || i>=m || j>=n) return false;
        if(grid[i][j]==0){
            grid[i][j] = 1;
            boolean up = DFS(i-1,j);
            boolean down = DFS(i+1,j);
            boolean left = DFS(i,j-1);
            boolean right = DFS(i,j+1);
            return (up && down && left && right);
        }
        return true;    
    }
}
