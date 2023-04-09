class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && distance[s.charAt(i) - 'a'] != j - i - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
