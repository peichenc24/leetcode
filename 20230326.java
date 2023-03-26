class Solution {
    public boolean findSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < n - 1; ++i) {
            int sum = nums[i] + nums[i + 1];
            if (!seen.add(sum)) {
                return true;
            }
        }
        return false;
    }
}
