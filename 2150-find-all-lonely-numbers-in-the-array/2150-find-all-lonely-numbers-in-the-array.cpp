
class Solution {
public:
    vector<int> findLonely(vector<int>& nums) {
        unordered_map<int,int> freq;
        for(int &x : nums){
            freq[x]++;
        }
        vector<int> ans;
        for(int x:nums){
            if(freq[x]==1 && freq.find(x-1)==freq.end()&&freq.find(x+1)==freq.end()){
                ans.push_back(x);
            }
        }
        return ans;
        
    }
};