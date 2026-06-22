class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

        }
        int leftsum=0;
        if(sum-nums[0]==0) return 0;
        for(int i=1;i<nums.length;i++){
            leftsum+=nums[i-1];
            int rightsum=sum-nums[i]-leftsum;
            if(leftsum==rightsum) return i;
        }
        return -1;
        
    }
}