class Solution {
    public int findMaxK(int[] nums) {
        int k = -1;
        for (int x : nums) {
            for (int y : nums) {
                if (-x == y) {
                    k = Math.max(k, x);
                }
            }
        }
        return k;
    }
}
