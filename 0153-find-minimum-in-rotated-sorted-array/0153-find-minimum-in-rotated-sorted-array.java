class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int res=-1;
        while(l<h){
            int guess=l+(h-l)/2;
            if(nums[guess]>nums[h]){
                   l=guess+1;
            }else{
               h=guess;
            }
        }
        return nums[l];
        
    }
}