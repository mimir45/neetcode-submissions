class Solution {
    public int search(int[] nums, int target) {
        int len = nums.length;
         int l = 0 ;
    int r = len - 1;
    while (l <= r) {
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            l = mid + 1;
        }
        if (nums[mid] > target) {
            r = mid - 1;
        }
    }


    return -1;
        
    }
}
