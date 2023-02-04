class Solution {
    public int getMaximumConsecutive(int[] coins) {
        int res = 1;
        Arrays.sort(coins);
        for (int i : coins) {
            if (i > res) {
                break;
            }
            res += i;
        }
        return res;
    }
}
