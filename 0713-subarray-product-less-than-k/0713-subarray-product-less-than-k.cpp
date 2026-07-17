class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        if(k<=1) return 0;
        int left=0;
        int ans=0;
        long long p=1;
        for(int right=0;right<nums.size();right++){
            p*=nums[right];
            while(p>=k){
                p/=nums[left];
                left++;
            }
            ans+=right-left+1;
        }
        return ans;
    }
};