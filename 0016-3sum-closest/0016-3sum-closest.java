class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int maxdiff=Integer.MAX_VALUE;

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                int dif=Math.abs(sum-target);
                if(dif<maxdiff){
                    maxdiff=dif;
                    res=sum;
                }

                if (sum == target) {
                    

                    left++;
                    right--;
                     // skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;

        
    }
}