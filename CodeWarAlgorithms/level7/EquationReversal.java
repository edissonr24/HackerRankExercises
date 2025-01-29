package com.java.CodeWarAlgorithms.level7;

import java.util.Stack;

public class EquationReversal {
    public static String solve(String eq){
        //..
        Stack<String> myStack = new Stack<>();
        StringBuilder text = new StringBuilder();
        for (Character c : eq.toCharArray()) {
            if (isMathOperator(c)) {
                myStack.push(text.toString());
                myStack.push(c.toString());
                text = new StringBuilder();
            } else {
                text.append(c);
            }
        }
        myStack.push(text.toString());
        return createTextFromStack(myStack);
    }

    private static boolean isMathOperator(char c) {
        return c == '+' || c == '-' || c == '/' || c == '*';
    }

    private static String createTextFromStack(Stack myStack) {
        StringBuilder result = new StringBuilder();
        while (!myStack.isEmpty()) {
            result.append(myStack.pop());
        }
        return result.toString();
    }
}
