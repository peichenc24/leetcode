class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length()-1;
        int blen = b.length()-1;
        int carry=0;
        StringBuilder sb = new StringBuilder();
        while(alen>=0 || blen>=0) {
            int sum = carry;
            if(alen>=0) {
                sum+=(a.charAt(alen--)-'0');
            }
            if(blen>=0) {
                sum+=(b.charAt(blen--)-'0');
            }
            sb.insert(0, sum%2);
            carry=sum>>1;
        }
        if(carry==1) {
            sb.insert(0,1);
        }
		//return String
        return sb.toString();
    }
}