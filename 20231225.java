class Solution {
    public int numDecodings(String s) {
        
        //If string is with leading zeroes -> No solution
        if(s.charAt(0)=='0') return 0;
        
        //If string length is 1 -> only 1 solution. Note s="0" checked above
        if(s.length()==1)   return 1;
        
        //pTp -> previous to previous count
        // p -> prev count
        //d -> single digit
        //dd -> double digit
        int pTp = 1, p = 1;
        for(int i=1;i<s.length();i++){
            int d = s.charAt(i)-'0';
            int dd = (s.charAt(i-1)-'0')*10+d;
            int cur = 0;
            
            //If single digit b/w 1-9 => Current count will be prev times
            if(d>0) cur = cur+p;    //Consider corner case s="10"
            
            //If double digit b/w 10-26 => Current count will be cur+prev To Prev Time
            if(dd>=10 && dd<=26)    cur = cur+pTp;    //Consider corner case s="10"
            
            pTp = p;
            p = cur;
        }
        return p;
    }
}
