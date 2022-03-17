class Solution {
    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(')
                stack.push(-1);
            else {
                if(!stack.isEmpty() && stack.peek() == -1)
                {
                    stack.pop(); // remove '('
                    stack.push(1);
                }
                else {
                    // top of the stack is number
                    int sum = 0;
                    while(!stack.isEmpty() && stack.peek()!=-1) {
                        sum += stack.pop();
                    }
                    
                    stack.pop();
                    stack.push(2*sum);
                }
            }
        }
        
        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}