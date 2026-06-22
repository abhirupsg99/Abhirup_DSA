class Pair{
    int i,j,t;
    Pair(int i,int j,int t){
        this.i=i;
        this.j=j;
        this.t=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int rows=grid.length;
        int col=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                }

            }
        }
        int time=0;
        while(!q.isEmpty()){
            Pair x=q.remove();
            int i=x.i;
            int j=x.j;
            int t=x.t;
            time=Math.max(time,t);
            if(i-1>=0 && grid[i-1][j]==1){
                grid[i-1][j]=2;
                q.add(new Pair(i-1,j,t+1));
            }
            if(j-1>=0 && grid[i][j-1]==1){
                grid[i][j-1]=2;
                q.add(new Pair(i,j-1,t+1));
            }
            if(i+1<rows && grid[i+1][j]==1){
                grid[i+1][j]=2;
                q.add(new Pair(i+1,j,t+1));
            }
            if(j+1<col && grid[i][j+1]==1){
                grid[i][j+1]=2;
                q.add(new Pair(i,j+1,t+1));
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return time;

        
    }
}