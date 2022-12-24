class Solution {
    public String largestMerge(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        String str = word1 + "@" + word2 + "*";
        int[] suffixArray = buildSuffixArray(str); 
        int[] rank = new int[m + n + 2];
        for (int i = 0; i < m + n + 2; i++) {
            rank[suffixArray[i]] = i;
        }

        StringBuilder merge = new StringBuilder();
        int i = 0, j = 0;
        while (i < m || j < n) {
            if (i < m && rank[i] > rank[m + 1 + j]) {
                merge.append(word1.charAt(i));
                i++;
            } else {
                merge.append(word2.charAt(j));
                j++;
            }
        }
        return merge.toString();
    }

    public int[] buildSuffixArray(String text) {
        int[] order = sortCharacters(text);
        int[] classfiy = computeCharClasses(text, order);
        int len = 1;
        int n = text.length();
        for (int i = 1; i < n; i <<= 1) {
            order = sortDoubled(text, i, order, classfiy);
            classfiy = updateClasses(order, classfiy, i);
        }
        return order;
    }

    public int[] sortCharacters(String text) {
        int n = text.length();
        int[] count = new int[128];
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            count[c]++;
        }    
        for (int i = 1; i < 128; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            count[text.charAt(i)]--;
            order[count[text.charAt(i)]] = i;
        }
        return order;
    }

    public int[] computeCharClasses(String text, int[] order) {
        int n = text.length();
        int[] res = new int[n];
        res[order[0]] = 0;
        for (int i = 1; i < n; i++) {
            if (text.charAt(order[i]) != text.charAt(order[i - 1])) {
                res[order[i]] = res[order[i - 1]] + 1;
            } else {
                res[order[i]] = res[order[i - 1]];
            }
        }
        return res;
    }

    public int[] sortDoubled(String text, int len, int[]  order, int[] classfiy) {
        int n = text.length();
        int[] count = new int[n];
        int[] newOrder = new int[n];
        for (int i = 0; i < n; i++) {
            count[classfiy[i]]++;
        }
        for (int i = 1; i < n; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int start = (order[i] - len + n) % n;
            int cl = classfiy[start];
            count[cl]--;
            newOrder[count[cl]] = start;
        }
        return newOrder;
    }

    public int[] updateClasses(int[] newOrder, int[] classfiy, int len) {
        int n = newOrder.length;
        int[] newClassfiy = new int[n];
        newClassfiy[newOrder[0]] = 0;
        for (int i = 1; i < n; i++) {
            int curr = newOrder[i];
            int prev = newOrder[i - 1];
            int mid = curr + len;
            int midPrev = (prev + len) % n;
            if (classfiy[curr] != classfiy[prev] || classfiy[mid] != classfiy[midPrev]) {
                newClassfiy[curr] = newClassfiy[prev] + 1;
            } else {
                newClassfiy[curr] = newClassfiy[prev];
            }
        }
        return newClassfiy;
    }
}
