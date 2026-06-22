class Solution {
    public int numIslands(char[][] grid) 
    {
        
        if(grid==null||grid.length==0) return 0;
        int rows=grid.length;
        int col=grid[0].length;
        boolean[][] vis=new boolean[rows][col];
        int cnt=0;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {

            if(grid[i][j]=='1'&& !vis[i][j])
            {
                
                dfs(grid,vis,i,j);
                cnt++;
            }
        }
    }return cnt;
}
private void dfs(char[][] grid,boolean [][] vis, int i,int j){
    
    if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0')
    {
        return;
    }
    if(grid[i][j]=='0'|| vis[i][j]){
        return;
    }
    vis[i][j] = true;
    dfs(grid,vis,i+1,j);
    dfs(grid,vis,i-1,j);
    dfs(grid,vis,i,j+1);
    dfs(grid,vis,i,j-1);
}
}