class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int totalXOR=0;
        for(auto &n:nums){
            totalXOR^=n;
        }
        int diff=totalXOR^k;
        return __builtin_popcount(diff);
        
    }
};