import java.util.Arrays;

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int L = original.length;
        if (m * n != L) return new int[0][];
        int[][] ans = new int[m][n];
        int i = 0;
        int start = 0;
        while (i < m) {
            ans[i] = Arrays.copyOfRange(original, start, start + n);
            i += 1;
            start = start + n;
        }
        return ans;
    }
}