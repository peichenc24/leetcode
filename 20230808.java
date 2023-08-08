class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxDP = 0;  // 子数组最大和状态
        int minDP = 0;  // 子数组最小和状态
        int maxSubSum = Integer.MIN_VALUE;  // 最大子数组和
        int minSubSum = Integer.MAX_VALUE;  // 最小子数组和
        for(int num: nums){
            maxDP = Math.max(maxDP, 0) + num;       // 更新最大和状态
            maxSubSum = Math.max(maxDP, maxSubSum); //  更新最大和
            minDP = Math.min(minDP, 0) + num;       // 更新最小和状态
            minSubSum = Math.min(minDP, minSubSum); // 更新最小和
        }
        return Math.max(maxSubSum, -minSubSum); // 结果要么是最大和，要么是最小和的相反数
    }
}
