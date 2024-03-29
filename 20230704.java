class Solution {
    public int matrixSum(int[][] nums) {
        int res = 0;
        int m = nums.length;
        int n = nums[0].length;
        PriorityQueue<Integer>[] pq = new PriorityQueue[m];
        for (int i = 0; i < m; i++) {
            pq[i] = new PriorityQueue<Integer>((a, b) -> b - a);
            for (int j = 0; j < n; j++) {
                pq[i].offer(nums[i][j]);
            }
        }
        for (int j = 0; j < n; j++) {
            int maxVal = 0;
            for (int i = 0; i < m; i++) {
                maxVal = Math.max(maxVal, pq[i].poll());
            }
            res += maxVal;
        }
        return res;
    }
}
