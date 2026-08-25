class Solution {
public:
    int findMin(vector<int>& nums) {
        int left=0;
        int right=nums.size()-1;
        while(left<right){
            int m=left+(right-left)/2;
            if(nums[m]>nums[right])
            left=m+1;
            else
            right=m;
        }
        return nums[left];
        
    }
};