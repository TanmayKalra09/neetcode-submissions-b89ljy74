class Solution {
    public int evalRPN(String[] tokens) {
        int a;
        int b;
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a+b);
            }
            else if(token.equals("-")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a-b);
            }
            else if(token.equals("*")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a*b);
            }
            else if(token.equals("/")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a/b);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
        
    }
}
