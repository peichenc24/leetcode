class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int x = 1; x <= 1000; x++) {
            for (int y = 1; y <= 1000; y++) {
                if (customfunction.f(x, y) == z) {
                    List<Integer> pair = new ArrayList<Integer>();
                    pair.add(x);
                    pair.add(y);
                    res.add(pair);
                }
            }
        }
        return res;
    }
}
