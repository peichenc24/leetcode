class Solution {
    public int minCount(int[] coins) {
        int sum = 0;
        for (int i : coins) {
            sum += (i + 1) / 2;
        }
        return sum;
    }
}
