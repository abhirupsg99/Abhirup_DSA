class Solution {
public:
    void backtrack(string &s, int idx, vector<string> &curr,
                   vector<vector<string>> &result,
                   vector<vector<bool>> &pal) {

        if (idx == s.size()) {
            result.push_back(curr);
            return;
        }

        for (int i = idx; i < s.size(); i++) {
            if (pal[idx][i]) {
                curr.push_back(s.substr(idx, i - idx + 1));
                backtrack(s, i + 1, curr, result, pal);
                curr.pop_back();
            }
        }
    }

    vector<vector<string>> partition(string s) {

        int n = s.size();
        vector<vector<bool>> pal(n, vector<bool>(n, false));

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (len == 1)
                    pal[i][j] = true;
                else if (len == 2)
                    pal[i][j] = (s[i] == s[j]);
                else
                    pal[i][j] = (s[i] == s[j] && pal[i + 1][j - 1]);
            }
        }

        vector<vector<string>> result;
        vector<string> curr;

        backtrack(s, 0, curr, result, pal);

        return result;
    }
};