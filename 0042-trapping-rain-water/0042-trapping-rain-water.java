class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int Water=0;
        int lmax=height[left],rmax=height[right];
        while(left<right)
        {
            if(lmax<rmax)
            {
                left++;
                lmax=Math.max(lmax,height[left]);
                Water+=lmax-height[left];
            }
            else{
                right--;
                rmax=Math.max(rmax,height[right]);
                Water+=rmax-height[right];

            }
        }
        return Water;
        
    }
}