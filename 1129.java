class Solution {
   public int minOperations(String s) {
       int a = 0, b = 0, n = s.length();
       char[] arr = s.toCharArray();
       for (int i = 0; i < n; i++) a += arr[i] ^ '0' ^ (i & 1);// 01010101  
       return Math.min(a, n - a);
   }
}
