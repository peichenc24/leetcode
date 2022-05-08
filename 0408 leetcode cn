class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (nums[i] - 1 != i) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
