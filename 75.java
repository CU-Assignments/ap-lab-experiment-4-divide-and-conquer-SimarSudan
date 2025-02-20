class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid] and move both pointers forward
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If it's 1, just move mid forward
                mid++;
            } else {
                // Swap nums[mid] and nums[high], and move high pointer backward
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
/*nums =
[2,0,2,1,1,0]
Output
[0,0,1,1,2,2]
Expected
[0,0,1,1,2,2]*/
