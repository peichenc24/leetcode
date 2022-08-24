class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> counts1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> counts2 = new HashMap<Integer, Integer>();
        for (int num : target) {
            counts1.put(num, counts1.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            counts2.put(num, counts2.getOrDefault(num, 0) + 1);
        }
        if (counts1.size() != counts2.size()) {
            return false;
        }
        for (Map.Entry<Integer, Integer> entry : counts1.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (!counts2.containsKey(key) || counts2.get(key) != value) {
                return false;
            }
        }
        return true;
    }
}
