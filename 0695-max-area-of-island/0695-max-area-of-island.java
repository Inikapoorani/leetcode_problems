class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      int n=grid.length;
      int m=grid[0].length;
      int max=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
               max=Math.max(max,dfs(grid,i,j,n,m));
            }
        }
      } 
      return max; 
    }
    private int dfs(int[][] grid,int i,int j, int n,int m){
        int count=1;
        if(i<0||i>=n||j<0||j>=m||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        count+=dfs(grid,i-1,j,n,m);
        count+=dfs(grid,i+1,j,n,m);
        count+=dfs(grid,i,j-1,n,m);
        count+=dfs(grid,i,j+1,n,m);
        return count;
    }
}