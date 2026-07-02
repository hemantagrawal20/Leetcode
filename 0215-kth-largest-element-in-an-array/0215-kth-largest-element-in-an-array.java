class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums.length-k;
        return nums[l];
    }
}