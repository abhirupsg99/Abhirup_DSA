class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) { // Fixed variable name from 'k' to 'target'
                    return new int[]{i, j}; // Corrected array creation syntax
                }
            }
        }
        return new int[0]; // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}