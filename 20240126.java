public class Solution {
    int f(int i, int j, String s1, String s2, int[][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + f(i - 1, j - 1, s1, s2, dp);
        }

        return dp[i][j] = Math.max(f(i, j - 1, s1, s2, dp), f(i - 1, j, s1, s2, dp));
    }

    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(n - 1, m - 1, s1, s2, dp);
    }
}
