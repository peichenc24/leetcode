class Solution {

    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0];
        if (gcd == 1) {
            return true;
        }

        for (int i = 1; i < nums.length; i++) {
            if ((gcd = gcd(gcd, nums[i])) == 1) {
                return true;
            }
        }
        return false;
    }

    public static int gcd(int l, int b) {
        if (b < l) {
            return gcd(b, l);
        }

        while (true) {
            if ((b = b % l) == 0) {
                return l;
            }
            if ((l = l % b) == 0) {
                return b;
            }
        }
    }
}
