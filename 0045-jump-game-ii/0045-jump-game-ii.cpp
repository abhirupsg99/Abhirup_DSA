class Solution {
public:
    int jump(vector<int>& nums) {
        int f=0;
        int jumps=0;
        int currend=0;
    
        for(int i=0;i<nums.size()-1;i++){
            if(i>f) return 0;
            f=max(f,i+nums[i]);
            if(i==currend)
            {
                jumps++;
                currend=f;
            }
        }
        return jumps;
    
    
    }
};