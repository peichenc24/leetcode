public class SolutionCN {
    public int lastRemaining(int n) {
        if (n == 1) return 1;
        int pre = n / 2;
        return 2 * (pre - lastRemaining(pre) + 1);
    }
}
