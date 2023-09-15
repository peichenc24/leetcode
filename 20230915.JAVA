class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        for (int[] operation : operations) {
            int x = operation[0], y = operation[1];
            int number = gem[x] / 2;
            gem[x] -= number;
            gem[y] += number;
        }
        int mn = gem[0], mx = gem[0];
        for (int number : gem) {
            mn = Math.min(number, mn);
            mx = Math.max(number, mx);
        }
        return mx - mn;
    }
}
