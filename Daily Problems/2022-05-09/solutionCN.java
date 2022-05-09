class Solution {
    public int[] diStringMatch(String s) {
        int lo = 0, len = s.length(), hi = len;
        int[] result = new int[len+1];
        for(int i = 0; i < len; i++)
        {
            result[i] = s.charAt(i) == 'I' ? lo++ : hi --;
        }
        result[len] = lo;
        return result;
    }
}