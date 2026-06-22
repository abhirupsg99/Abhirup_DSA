class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int m=matrix.size();
        int n=matrix[0].size();
        queue<pair<int,int>> q;
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          {
            if(matrix[i][j]==0)
            q.push({i,j});

          }
        }
        vector<vector<int>> ans=matrix;
        while(!q.empty()){
            auto [r,c]=q.front();
            q.pop();
            for(int i=0;i<m;i++){
                ans[i][c]=0;
            }
            for(int j=0;j<n;j++){
                ans[r][j]=0;
            }
        }
        matrix=ans;
        
        
    }
};