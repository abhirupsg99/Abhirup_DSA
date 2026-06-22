class Solution {
public:
int solve(int n,unordered_map<int,int>& dp)
{
    if(n == 0 || n == 1) return n;

        if(dp.find(n) != dp.end()) {
            return dp[n];
        }

        dp[n] = solve(n-1, dp) + solve(n-2, dp);
        return dp[n];
}

    int fib(int n) {
        
        unordered_map<int,int> dp;
        return solve(n, dp);
    }
};