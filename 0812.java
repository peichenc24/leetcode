class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        final Map<String, Integer> need = new HashMap<>();
        for (final String word : words) {
            need.put(word, need.getOrDefault(word, 0) + 1);
        }
        final int n = s.length();
        final int num = words.length;
        final int len = words[0].length();
        final List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int l = i, count = 0;
            final Map<String, Integer> seen = new HashMap<>();
            for (int j = i; j <= n - len; j += len) {
                final String word = s.substring(j, j + len);
                if (need.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) <= need.get(word)) {
                        count++;
                    } else {
                        while (seen.get(word) > need.get(word)) {
                            final String first = s.substring(l, l += len);
                            seen.put(first, seen.getOrDefault(first, 0) - 1);
                            if (seen.get(first) < need.getOrDefault(first, 0)) {
                                count--;
                            }
                        }
                    }
                    if (count == num) {
                        ans.add(l);
                        count--;
                        final String first = s.substring(l, l += len);
                        seen.put(first, seen.get(first) - 1);
                    }
                } else {
                    seen.clear();
                    count = 0;
                    l = j + len;
                }
            }
        }
        return ans;
    }
}
