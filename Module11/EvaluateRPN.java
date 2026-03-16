package Assignments.Module11;
//LeetCode 150 – Evaluate Reverse Polish Notation
import java.util.*;

class EvaluateRPN {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);

            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);

            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);

            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] tokens1 = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens1));

        String[] tokens2 = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens2));
    }
}