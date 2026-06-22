class Solution {
public:
    int search(vector<int>& nums, int target) {
        int s = 0, e = nums.size() - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            // Found the target
            if (nums[m] == target)
                return m;

            // Left half is sorted
            if (nums[s] <= nums[m]) {
                if (target >= nums[s] && target < nums[m])
                    e = m - 1;
                else
                    s = m + 1;
            }
            // Right half is sorted
            else {
                if (target > nums[m] && target <= nums[e])
                    s = m + 1;
                else
                    e = m - 1;
            }
        }
        return -1; // target not found
    }
};
