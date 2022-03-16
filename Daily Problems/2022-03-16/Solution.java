class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0; // pointer on popped array
        int i = 0; // pointer on pushed array
        for(int x: pushed){
            pushed[i++] = x;
            while(i > 0 && pushed[i - 1] == popped[j]){ 
                i--; // decrement i
                j++; // increment j
            }
        }
        return i == 0;
    }
}