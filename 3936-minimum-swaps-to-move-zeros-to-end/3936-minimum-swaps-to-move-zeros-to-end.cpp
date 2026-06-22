class Solution {
public:
    int minimumSwaps(vector<int>& nums) {
        int cnt=0;
        for(auto it:nums){
            if(it>0){
                cnt++;
            }
        }
        int ans=0;
        for(auto it : nums){
            if(it==0 && cnt >0){
                ans++;
                cnt--;
            }
            else if(it>0){
                cnt--;
            }
        }
        return ans;
    }
};